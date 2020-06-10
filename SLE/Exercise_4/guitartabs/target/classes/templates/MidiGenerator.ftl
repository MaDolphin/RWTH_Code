from midiutil.MidiFile import MIDIFile


def generate_midi():
    MyMIDI = MIDIFile(1)
    track = 0
    time = 0
    MyMIDI.addTrackName(track, time, "Software Engineering RWTH")
    MyMIDI.addTempo(track, time, 120)

    # Select acoustic guitar sound
    MyMIDI.addProgramChange(track, 0, 0, 25)

    # Add Notes
    channel = 0
    volume = 100

<#list guitarTabMap as g>
    pitch = ${g.pitch}
    time = ${g.time}
    duration = ${g.duration}
    MyMIDI.addNote(track, channel, pitch, time, duration, volume)

</#list>

    # Write Midi to disk
    binfile = open("output.mid", 'wb')
    MyMIDI.writeFile(binfile)
    binfile.close()


if __name__ == '__main__':
    generate_midi()
