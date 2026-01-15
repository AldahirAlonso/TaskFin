-- Insertar tareas de ejemplo respetando los atributos de TaskEntity
-- Nota: Hibernate convierte camelCase (taskName) a snake_case (task_name) por defecto

INSERT INTO task_fin (task_name, task_description, task_status, task_start_time, task_end_time, task_start_date, task_end_date)
VALUES (
           'Configurar Proyecto React',
           'Instalar dependencias de Vite, TypeScript y configurar Axios para la conexión con el backend.',
           'COMPLETADO',
           '09:00:00',
           '11:00:00',
           '2026-01-15',
           '2026-01-15'
       ) ON CONFLICT (task_name) DO NOTHING;

INSERT INTO task_fin (task_name, task_description, task_status, task_start_time, task_end_time, task_start_date, task_end_date)
VALUES (
           'Crear Entidad JPA en Spring',
           'Definir los atributos de TaskEntity y configurar las anotaciones de Hibernate.',
           'COMPLETADO',
           '14:00:00',
           '15:30:00',
           '2026-01-15',
           '2026-01-15'
       ) ON CONFLICT (task_name) DO NOTHING;

INSERT INTO task_fin (task_name, task_description, task_status, task_start_time, task_end_time, task_start_date, task_end_date)
VALUES (
           'Bicicleta Estática',
           'Sesión de ejercicio diaria de 40 minutos para mantener la salud cognitiva.',
           'PENDIENTE',
           '18:00:00',
           '18:40:00',
           '2026-01-15',
           '2026-01-15'
       ) ON CONFLICT (task_name) DO NOTHING;

INSERT INTO task_fin (task_name, task_description, task_status, task_start_time, task_end_time, task_start_date, task_end_date)
VALUES (
           'Revisión Veterinaria',
           'Llevar a los gatos a su chequeo preventivo para asegurar que estén bien de salud.',
           'EN PROCESO',
           '10:00:00',
           '12:00:00',
           '2026-01-16',
           '2026-01-16'
       ) ON CONFLICT (task_name) DO NOTHING;

INSERT INTO task_fin (task_name, task_description, task_status, task_start_time, task_end_time, task_start_date, task_end_date)
VALUES (
           'Desplegar en Render',
           'Configurar el Web Service en Render y conectar la base de datos de PostgreSQL.',
           'PENDIENTE',
           '11:00:00',
           '13:00:00',
           '2026-01-17',
           '2026-01-17'
       ) ON CONFLICT (task_name) DO NOTHING;