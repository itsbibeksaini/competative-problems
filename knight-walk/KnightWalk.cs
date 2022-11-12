using System;
using System.Collections.Generic;

namespace CompetitivePrroblems
{
    public class KnightWalk
    {
        int chessBoardSize = 8;

        // recoring the knight movements in differeent directions on chess board clockwise.
        int[] directionX = { -2, -1, 1, 2, 2, 1, -1, -2 };
        int[] directionY = { 1, 2, 2, 1, -1, -2, -2, -1 };
        int[,] chessBoard;
        char[] rowLabels = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        Queue<Position> exploredPositions;
        int currentStep = 0;
        
        public KnightWalk()
        {
            chessBoard = new int[chessBoardSize, chessBoardSize];
            exploredPositions = new();
        }

        /// <summary>
        /// Checks for position is inside boundries of chess board.
        /// </summary>
        /// <param name="position"></param>
        /// <returns></returns>
        private bool IsPositionValid(Position position)
        {
            return (position.X >= 1 && position.X < chessBoardSize) && (position.Y >= 1 && position.Y < chessBoardSize); 
        }

        /// <summary>
        /// Using BFS to find minimun shortest path between start and end position.
        /// </summary>
        /// <param name="startPosition"></param>
        /// <param name="endPosition"></param>
        public void Travel(Position startPosition, Position endPosition)
        {
            // add start position to queue.
            exploredPositions.Enqueue(startPosition);

            // iterate while there are elements in queue.
            while(exploredPositions.Count != 0)
            {
                // dequeue first element.
                Position currentPosition = exploredPositions.Dequeue();

                currentStep = currentPosition.STEP;
                string prevStep = currentPosition.PREV_STEP;

                // break the loop if end position is found.
                if(currentPosition.X == endPosition.X && currentPosition.Y == endPosition.Y)
                {
                    chessBoard[currentPosition.X - 1, currentPosition.Y - 1] = 100;
                    Console.WriteLine();
                    Console.WriteLine("Shortest path ==>");
                    Console.WriteLine(currentPosition.PREV_STEP.Trim());
                    break;
                }

                // check if current position is already visited(none visited positions will be 0).
                if(chessBoard[currentPosition.X -1, currentPosition.Y -1] == 0)
                {
                    // mark current position visited on chessboard.
                    chessBoard[currentPosition.X - 1, currentPosition.Y - 1] = currentStep;

                    // iteratee over all the direction a knight can move one step(count only valid ones).
                    for (int i = 0; i < directionX.Length; i++)
                    {
                        Position newPosition = new()
                        {
                            X = currentPosition.X + directionX[i],
                            Y = currentPosition.Y + directionY[i]
                        };

                        // check if position lies within the chess board
                        if(IsPositionValid(newPosition))
                        {

                            // increase the step and add previous position in next position
                            newPosition.STEP = currentStep + 1;
                            newPosition.PREV_STEP = prevStep + " " + ( rowLabels[newPosition.X -1].ToString() + newPosition.Y );
                            exploredPositions.Enqueue(newPosition);
                        }
                    }
                }

            }

            Console.WriteLine();
            Console.WriteLine("Max Step => " + (currentStep - 1));
            Console.WriteLine();
            Console.WriteLine("Matrix oof steps taken");
            Console.WriteLine();
            for (int i = 0; i < chessBoardSize; i++)
            {
                for (int j = 0; j < chessBoardSize; j++)
                {
                    Console.Write(chessBoard[j, i] + " ");
                }
                Console.WriteLine();
            }
            Console.WriteLine();
            Console.WriteLine("100 mark as finished position" );


        }

        /// <summary>
        /// Build a position object by extracting x and y entered in a string.
        /// </summary>
        /// <param name="p"></param>
        /// <returns></returns>
        public Position GetPosition(string p)
        {
            Position position = new()
            {
                X = Array.IndexOf(rowLabels, p[0]) + 1,
                Y = int.Parse(p[1].ToString()),
            };

            return position;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Enter start position and end position");

            string input = Console.ReadLine();

            string[] positions = input.Split(' ');

            KnightWalk knightWalk = new KnightWalk();

            knightWalk.Travel(knightWalk.GetPosition(positions[0]), knightWalk.GetPosition(positions[1]));
        }
    }

    public class Position
    {
        public int X { get; set; }
        public int Y { get; set; }
        public int STEP { get; set; } = 1;
        public string PREV_STEP { get; set; }
    }
}
