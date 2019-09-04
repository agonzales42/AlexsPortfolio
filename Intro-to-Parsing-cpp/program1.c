// Alexander Gonzales
// 8/29/2019
// CS370 - Compilers and Automata
// Instructor - Jonathan Cook
// Program1.c
// Purpose: Parse a file or standard input to calculate a word and line count


#include <stdio.h>
#include <stdlib.h>
#include <string.h> // Contains the strtok function that returns a char*

int processLine(char*);  // takes line token and returns # of words in that line


int main(int argc, char **argv) { // main takes arguments from command line
    
    if(argc > 2)
    {   // if there are too many arguments
        printf("Only argument should be File name, otherwise no arguments\n");
        return -1; // end with error
    }// end if
    
    FILE* fp = NULL;   // create file pointer
    
    if(argc == 1) 
    {   // no file name, use standard input
        fp = stdin;
        printf("Using standard input... ctrl d to end.\n");
    } else
    {   // User entered a file name as an argument
        fp = fopen(argv[1], "r");
        if(fp == NULL)
        {   // file name entered doesnt exist
            printf("Invalid file name. Ending.\n\n");
            return -1; // end with error
        }// end if
    }// end else (
    
    char linetoken[1000]; // string of characters in an individual line (up to 1000)
    int wordC = 0, lineC = 0; // declare word count and line count at 0
    
    while(fgets(linetoken, sizeof(linetoken), fp))
    {   // create line tokens from each line of the file
        lineC++; // increment line count
        wordC += processLine(linetoken); // increment word count by processing line
    }// end while
    
    printf("Words: %d\nLines: %d\n", wordC, lineC); // print word and line count

}// end main


int processLine(char line[])
{   // process words in a line
    int words = 0;   // start this line's word count at 0
    char* wordtoken;
    wordtoken = strtok(line, " \t\r\n"); // first word in line
    while(wordtoken != NULL)
    {   // loop through line until there are no more words  
        words++;  // increment word count
        wordtoken = strtok(NULL, " \t\r\n"); // next word in line
    }// end while
    return words; // return the number of words in this line
}// end processLine

