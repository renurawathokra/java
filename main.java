# javaimport java util.scanner;
class main 
public staic void main(string[]args)
{
int a[] []=new int [3][3];
int sum=0;
scanner ob=new scanner(system in);
system.out print("enter the matrix:");
for (int i=0;i<3;i++)
{
for (int j=0;j<3;j++)
{
a [i][j]=ob.nextint();
}
}
system.out.print();
for(int i=0;i<3;i++)
{
sum=0;
for(int j=0;j<3;j++)
{
sum+=a[i][y];
system.out.print(""+a[i][j]);
}
system.out.print(""+sum);

system.out.prntln();
}for(int i=0;i<3;i++)
{
sum=0;
for (int j=0;j<3;j++)
{
sum+=a[j][i];
}
system.out.println(""+sum);
}
}
}

