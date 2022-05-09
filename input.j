.class public input
.super java/lang/Object
.field public static i I
.field public static j I
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 0
istore 0
ldc 4
istore 1
for1:
ldc 1
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 0
istore 3
ldc 4
istore 4
for4:
ldc 2
istore 5
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 5
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iinc 3 +1
iload 3
iload 4
if_icmplt for4
continue1:
iinc 0 +1
iload 0
iload 1
if_icmplt for1
continue0:
return
.end method
