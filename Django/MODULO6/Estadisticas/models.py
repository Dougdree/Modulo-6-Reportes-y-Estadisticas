from django.db import models

class Producto(models.Model):
    nombre = models.CharField(max_length=50)
    precio = models.FloatField()
    categoria = models.CharField(max_length=50)
    cantidad= models.IntegerField(max_length=10)

    def __str__(self):
        return self.nombre

class Item_Factura(models.Model):
    subTotal = models.FloatField()
    cantidad = models.IntegerField(max_length=10)
    producto= models.foreighKey(Producto, related_name='itemFactura', on_delete=models.CASCADE)

    def __str__(self):
        return self.producto.nombre

    def calcular_Subtotal(self):
        return self.cantidad * self.producto.precio

    def calcular_Total(self):
        return self.subTotal

class Factura(models.Model):
    numero= models.CharField(max_length=20)
    fecha = models.DateField()
    impuesto= models.FloatField()
    descuento = models.FloatField()
    total = models.FloatField()
    itemFacturaList = models.foreighKey(Item_Factura, related_name='factura', on_delete=models.CASCADE)

    def __str__(self):
        return self.numero

    def calcular_Impuesto(self):
        return self.itemFacturaList.subtotal*0.12

    def calcular_Descuento(self):
        return self.itemFacturaList.subtotal*0.05

    def calcular_Total(self):

class Mesa(models.Model):
    cantidad_uso = models.IntegerField(max_length=10)
    codigo = models.CharField(max_length=20)

    def __str__(self):
        return self.codigo

class Persona(models.Model):
    nombre = models.CharField(max_length=50)
    cedula = models.CharField(max_length=10)

    def __str__(self):
        return self.nombre

class Mesero(Persona):
    pedidosAtentidos = models.IntegerField(max_length=50)

    def Actualizar_PedidosAtendidos(self):
        return self.pedidosAtentidos + 1

class estadistica(models.Model):
    titulo= models.CharField(max_length=50)

class estadistica_mesero(estadistica):
    mejor_mesero = models.CharField(max_length=50)

class estadistica_mesa(estadistica):
    mesa_mas_usada = models.CharField(max_length=50)

class estadistica_producto(estadistica):
    producto_mas_vendido = models.CharField(max_length=50)

class reporte(models.Model):
    titulo = models.CharField(max_length=50)
    estadistica_list = models.CharField(max_length=200)

class grafico(models.Model):
    titulo = models.CharField(max_length=50)

