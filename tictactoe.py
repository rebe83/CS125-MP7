from Tkinter import *
from ttk import Entry, Button

class Tile(Label):
    def __init__(self, parent):
        Label.__init__(self, parent, font = ("", 30), width = 5, justify = 'center', relief = 'raised', bg = 'white')


class Main():
    def __init__ (self, parent):
        self.parent = parent

        self.player1 = StringVar()
        self.player2 = StringVar()

        self.createWidgets()

    def createWidgets(self):
        self.mainFrame = Frame(self.parent)
        Label(self.mainFrame, text = 'Tic Tac Toe', font = ("", 50)).pack()
        frame1 = Frame(self.mainFrame)
        Label(frame1, text = 'Player 1 (X, button - 1)').grid()
        Entry(frame1, textvariable = self.player1)
        Label(frame1, text = 'Player2 (O, button - 2)').grid()
        frame1.pack()
        self.mainFrame.pack(padx = 10, pady = 10)

    def start(self):
        player1 = self.player1.get()
        player2 = self.player2.get()

        if player1 and player2 and player1 != player2:
            self.mainFrame.forget()
            for i in range(3):
                for j in range(3):
                    Tile(self.gameFrame).grid(row = i, column = j)
        self.gameFrame.pack()