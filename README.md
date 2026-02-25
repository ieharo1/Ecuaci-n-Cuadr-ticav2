# 📊 N8N REPORTE VENTAS - Generación Automática

Proyecto de automatización n8n para generación de reportes de ventas desarrollado por **Isaac Esteban Haro Torres**.

---

## 📝 Descripción

Flujo de n8n que extrae datos de ventas de MySQL/SQL Server, genera un reporte con resumen y tabla de ventas, lo guarda en Google Sheets, y envía por email y Telegram de forma automática. Puede programarse diariamente, semanalmente o mensualmente.

---

## ✨ Características

- Trigger programable (diario/semanal/mensual)
- Extracción de datos de MySQL
- Generación de reporte HTML
- Guardado en Google Sheets
- Envío por Email y Telegram
- Completamente dockerizado con ngrok

---

## 🛠️ Stack Tecnológico

- n8n v2.6.1
- Docker
- MySQL / SQL Server
- Google Sheets
- Gmail API
- Telegram Bot API

---

## 🚀 Uso

### 1. Configurar credenciales

El archivo `.env` ya está configurado. Asegúrate de tener:

- **MySQL**: Credentials → New → MySQL → Host, User, Password, Database
- **Google Sheets**: Credentials → New → Google Sheets OAuth2
- **Gmail**: Credentials → New → Gmail OAuth2
- **Telegram**: Credentials → New → Telegram API → Bot Token

### 2. Levantar contenedor

```bash
docker-compose up -d
```

### 3. Acceder a n8n

- URL de ngrok: https://unpersuadable-joleen-ashen.ngrok-free.dev/
- Usuario: admin
- Contraseña: 12345

### 4. Importar flujo

1. En la UI de n8n, hacer clic en "Import from File"
2. Seleccionar el archivo `workflow.json`
3. Configurar las credenciales en n8n

---

## ⚙️ Configuración

### Cambiar frecuencia

En el nodo "Trigger Semanal", seleccionar:
- **Diario**: field = "days", daysInterval = 1
- **Semanal**: field = "weeks", weeksInterval = 1
- **Mensual**: field = "months", monthsInterval = 1

### Ajustar consulta SQL

En el nodo "Extraer Ventas MySQL", modificar la query según tu estructura de base de datos.

### Configurar destinatarios

En los nodos "Enviar por Email" y "Notificar Telegram", configurar las variables:
- `email_destino`: correo del destinatario
- `email_remitente`: correo desde donde se envía
- `telegram_chat_id`: ID de Telegram del destinatario

---

## 📁 Estructura del proyecto

```
N8N REPORTE VENTAS/
├── workflow.json      # Flujo de n8n
├── docker-compose.yml # Configuración Docker
├── .env               # Variables de entorno
└── README.md          # Este archivo
```

---

## 👨‍💻 Desarrollado por Isaac Esteban Haro Torres

**Ingeniero en Sistemas · Full Stack · Automatización · Data**

- 📧 Email: zackharo1@gmail.com
- 📱 WhatsApp: 098805517
- 💻 GitHub: https://github.com/ieharo1
- 🌐 Portafolio: https://ieharo1.github.io/portafolio-isaac.haro/

---

© 2026 Isaac Esteban Haro Torres - Todos los derechos reservados.
