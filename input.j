.class public input
.super java/lang/Object
.field public static numero I
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 1
istore 0
ldc 1
istore 1
iload 0
iload 1
iadd
istore 2
iload 2
putstatic input/numero I
ldc "teste"
astore 3
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 3
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
