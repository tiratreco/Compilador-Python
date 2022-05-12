.class public input
.super java/lang/Object
.field public static a I
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 0
istore 0
iload 0
putstatic input/a I
enter_while0:
getstatic input/a I
istore 1
ldc 4
istore 2
iload 1
iload 2
if_icmplt true0
ldc 0
goto cmp_end0
true0:
ldc 1
cmp_end0:
istore 3
ldc 0
istore 4
iload 3
iload 4
ior
istore 5
iload 5
ldc 1
if_icmpne break0
getstatic input/a I
istore 6
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 6
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic input/a I
istore 7
ldc 1
istore 8
iload 7
iload 8
iadd
istore 9
iload 9
putstatic input/a I
goto break0
goto enter_while0
break0:
return
.end method
