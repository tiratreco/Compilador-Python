.class public input
.super java/lang/Object
.field public static i I
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 0
istore 0
ldc 4
istore 1
for1:
ldc "OK"
astore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 2
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iinc 0 +1
iload 0
iload 1
if_icmplt for1
return
.end method
