package com.devops.vn

def regex = ~'Groovy'



//There are two special positional characters that are used to denote the beginning and end of a line: caret (∧) and dollar sign ($).
//
//Regular expressions can also include quantifiers. The plus sign (+) represents one or more times, applied to the preceding element of the expression. The asterisk (*) is used to represent zero or more occurrences. The question mark (?) denotes zero or once.
//
//The metacharacter { and } is used to match a specific number of instances of the preceding character.
//
//In a regular expression, the period symbol (.) can represent any character. This is described as the wildcard character.

//A regular expression may include character classes. A set of characters can be given as a simple sequence of characters enclosed in the metacharacters [and] as in [aeiou]. For letter or number ranges, you can use a dash separator as in [a–z] or [a–mA–M]. The complement of a character class is denoted by a leading caret within the square rackets as in [∧a–z] and represents all characters other than those specified. Some examples of Regular expressions are given below





/** Sample
'Groovy' =~ 'Groovy'
'Groovy' =~ 'oo'
'Groovy' ==~ 'Groovy'
'Groovy' ==~ 'oo';
'Groovy' =~ '∧G';
‘Groovy' =~ 'G$';
‘Groovy' =~ 'Gro*vy' 'Groovy' =~ 'Gro{2}vy'
*/

