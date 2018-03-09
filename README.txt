CIS-2013 Program 2 due March 9

Using the techniques shown in the sample code on the G drive, write Java TCP client and server programs
that will each support a keyboard user participating in a taking-turns chat.  Each user takes a turn
typing a single chat message to the other user then waits for that user to reply.
The taking-turns should continue till either user types a chat message of "EXITEXIT" at which point
both programs should coordinate a graceful shutdown of the connection and then terminate the program.