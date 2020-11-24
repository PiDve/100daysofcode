using System;

namespace c_
{

    class Functions
    {

    }
    class Program
    {

        public int calcYear(int year)
        {
            int days = year * 365;
            return days;
        }
        static void Main(string[] args)
        {
            Program Program = new Program();
            Console.WriteLine("Digite o número de anos:\r\n ");
            var x = Console.ReadLine();
            Console.WriteLine(Program.calcYear(int.Parse(x)));

        }
    }
}
