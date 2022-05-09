.class public input
.super java/lang/Object
.field public static numero I
.method public static teste()I
.limit stack 5
.limit locals 100
ldc "Ola"
astore 0
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 0
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 5
istore 1
iload 1
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
return
.end method
