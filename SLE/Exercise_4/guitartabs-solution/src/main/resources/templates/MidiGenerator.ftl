# (c) https://github.com/MontiCore/monticore
from midiutil.MidiFile import MIDIFile

<#setting locale="en_US">
<#assign offsets=[64,59,55,50,45,40]>
<#assign totalLength=0>
<#assign beatsPerBar=4.0>

def generate_midi():
    MyMIDI = MIDIFile(1)
    track = 0
    time = 0
    MyMIDI.addTrackName(track, time, "Software Engineering RWTH")
    MyMIDI.addTempo(track, time, 120)

    # Select acoustic guitar sound
    MyMIDI.addProgramChange(track, 0, 0, 26)

    # Add Notes
    channel = 0
    volume = 100
    <#list ast.getSixStringsList() as sixStrings>
        <#list sixStrings.getAllNotes() as notes>
            <#if notes.getLength().isPresent()>
                <#assign duration = beatsPerBar / notes.getLength().get()>
            <#else>
                <#assign duration = 1>
            </#if>
            <#list notes.getFrets() as fret>
                <#if fret.isPresent()>
                    <#assign pitch = fret.get() + offsets[fret?index]>
    MyMIDI.addNote(track, channel, ${pitch}, ${totalLength}, ${duration}, volume)
                </#if>
            </#list>
            <#assign totalLength += duration>
        </#list>
    </#list>

    # Write Midi to disk
    binfile = open("output.mid", 'wb')
    MyMIDI.writeFile(binfile)
    binfile.close()


if __name__ == '__main__':
    generate_midi()
