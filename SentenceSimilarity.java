public class SentenceSimilarity 
{
public static void main(String[] args) 
{
// System.out.println(areSentencesSimilar("My name is Haley", "My Haley"));
System.out.println(areSentencesSimilar("Eating right now", "Eating"));
}
static boolean areSentencesSimilar(String sentence1, String sentence2)
{
String[] words1 = sentence1.split(" "), words2 = sentence2.split(" ");
int i = 0, s1 = words1.length, s2 = words2.length;
if (s1 > s2) 
{
 return areSentencesSimilar(sentence2, sentence1);
}
while (i < s1 && words1[i].equals(words2[i])) 
{
    i++;
}
while (i < s1 && words1[i].equals(words2[s2 - s1 + i])) 
{
    i++;
}
return i==s1;
}
}