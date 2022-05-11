.class public input
.super java/lang/Object
.field public static count I
.field public static lim I
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner/nextInt()I
istore 0
iload 0
putstatic input/lim I
getstatic input/lim I
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 0
istore 2
getstatic input/lim I
istore 3
for3:
getstatic input/count I
istore 4
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 4
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iinc 2 +1
iload 2
iload 3
if_icmplt for3
continue0:
return
.end method
