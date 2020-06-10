# (c) https://github.com/MontiCore/monticore
from midiutil.MidiFile import MIDIFile


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
    MyMIDI.addNote(track, channel, 64, 0, 0.5, volume)
    MyMIDI.addNote(track, channel, 60, 0, 0.5, volume)
    MyMIDI.addNote(track, channel, 55, 0, 0.5, volume)
    MyMIDI.addNote(track, channel, 52, 0, 0.5, volume)
    MyMIDI.addNote(track, channel, 48, 0, 0.5, volume)
    MyMIDI.addNote(track, channel, 60, 0.5, 0.5, volume)
    MyMIDI.addNote(track, channel, 57, 1, 0.5, volume)
    MyMIDI.addNote(track, channel, 52, 1.5, 0.5, volume)
    MyMIDI.addNote(track, channel, 65, 2, 0.5, volume)
    MyMIDI.addNote(track, channel, 60, 2, 0.5, volume)
    MyMIDI.addNote(track, channel, 57, 2, 0.5, volume)
    MyMIDI.addNote(track, channel, 53, 2, 0.5, volume)
    MyMIDI.addNote(track, channel, 48, 2, 0.5, volume)
    MyMIDI.addNote(track, channel, 41, 2, 0.5, volume)
    MyMIDI.addNote(track, channel, 60, 2.5, 0.5, volume)
    MyMIDI.addNote(track, channel, 57, 3, 0.5, volume)
    MyMIDI.addNote(track, channel, 53, 3.5, 0.5, volume)
    MyMIDI.addNote(track, channel, 67, 4, 0.5, volume)
    MyMIDI.addNote(track, channel, 59, 4, 0.5, volume)
    MyMIDI.addNote(track, channel, 55, 4, 0.5, volume)
    MyMIDI.addNote(track, channel, 50, 4, 0.5, volume)
    MyMIDI.addNote(track, channel, 47, 4, 0.5, volume)
    MyMIDI.addNote(track, channel, 43, 4, 0.5, volume)
    MyMIDI.addNote(track, channel, 59, 4.5, 0.5, volume)
    MyMIDI.addNote(track, channel, 62, 5, 0.5, volume)
    MyMIDI.addNote(track, channel, 67, 5.5, 0.5, volume)
    MyMIDI.addNote(track, channel, 76, 6, 0.5, volume)
    MyMIDI.addNote(track, channel, 68, 6, 0.5, volume)
    MyMIDI.addNote(track, channel, 64, 6, 0.5, volume)
    MyMIDI.addNote(track, channel, 59, 6, 0.5, volume)
    MyMIDI.addNote(track, channel, 56, 6, 0.5, volume)
    MyMIDI.addNote(track, channel, 52, 6, 0.5, volume)
    MyMIDI.addNote(track, channel, 68, 6.5, 0.5, volume)
    MyMIDI.addNote(track, channel, 40, 6.5, 0.5, volume)
    MyMIDI.addNote(track, channel, 69, 7, 0.5, volume)
    MyMIDI.addNote(track, channel, 64, 7, 0.5, volume)
    MyMIDI.addNote(track, channel, 71, 7.5, 0.5, volume)
    MyMIDI.addNote(track, channel, 65, 8, 1, volume)
    MyMIDI.addNote(track, channel, 60, 8, 1, volume)
    MyMIDI.addNote(track, channel, 57, 8, 1, volume)
    MyMIDI.addNote(track, channel, 53, 8, 1, volume)
    MyMIDI.addNote(track, channel, 48, 8, 1, volume)
    MyMIDI.addNote(track, channel, 41, 8, 1, volume)
    MyMIDI.addNote(track, channel, 67, 9, 0.5, volume)
    MyMIDI.addNote(track, channel, 59, 9, 0.5, volume)
    MyMIDI.addNote(track, channel, 55, 9, 0.5, volume)
    MyMIDI.addNote(track, channel, 50, 9, 0.5, volume)
    MyMIDI.addNote(track, channel, 47, 9, 0.5, volume)
    MyMIDI.addNote(track, channel, 43, 9, 0.5, volume)
    MyMIDI.addNote(track, channel, 64, 9.5, 2, volume)
    MyMIDI.addNote(track, channel, 60, 9.5, 2, volume)
    MyMIDI.addNote(track, channel, 55, 9.5, 2, volume)
    MyMIDI.addNote(track, channel, 52, 9.5, 2, volume)
    MyMIDI.addNote(track, channel, 48, 9.5, 2, volume)

    # Write Midi to disk
    binfile = open("output.mid", 'wb')
    MyMIDI.writeFile(binfile)
    binfile.close()


if __name__ == '__main__':
    generate_midi()
