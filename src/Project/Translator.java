package Project;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    public static String translate(String text, Language language) {
        Map<String, String> enMessages = Map.ofEntries(
                Map.entry("greeting", "Welcome to platform!"),
                Map.entry("login", "Login: "),
                Map.entry("password", "Password: "),
                Map.entry("userNotFound", "User not found"),
                Map.entry("incorrectPassword", "Incorrect password (0 to leave)"),
                Map.entry("loginning", "Input is correct, Loginning..."),
                Map.entry("addingMarks", "Marks successfully added"),
                Map.entry("successRegistering", "Successfully registered for course"),
                Map.entry("teacherInfo", "Teacher for"),
                Map.entry("courseNotFound", "Course not found"),
                Map.entry("addingUser", "User added"),
                Map.entry("removingUser", "User removed"),
                Map.entry("publishingArticle", "New article published"),
                Map.entry("notifyingUser", "received an email notification"),
                Map.entry("consideringComplaint", "Your complaint has been approved. Wait for a reply"),
                Map.entry("errorRegistering", "Registration failed")
        );
        Map<String, String> ruMessages = Map.ofEntries(
                Map.entry("greeting", "Добро пожаловать!"),
                Map.entry("login", "Логин: "),
                Map.entry("password", "Пароль: "),
                Map.entry("userNotFound", "Пользователь не найден"),
                Map.entry("incorrectPassword", "Неправильный пароль (нажмите 0 для выхода)"),
                Map.entry("loginning", "Ввод верен. Подключение к аккаунту..."),
                Map.entry("addingMarks", "Оценки успешно добавлены"),
                Map.entry("successRegistering", "Успешно зарегистрирован на курс"),
                Map.entry("teacherInfo", "Учитель курса"),
                Map.entry("courseNotFound", "Курс не найден"),
                Map.entry("addingUser", "Пользователь добавлен"),
                Map.entry("removingUser", "Пользователь удален"),
                Map.entry("publishingArticle", "Опубликована новая статья"),
                Map.entry("notifyingUser", "получил(-a) уведомление"),
                Map.entry("consideringComplaint", "Ваша жалоба одобрена. Ждите ответа"),
                Map.entry("errorRegistering", "Регистрация не удалась")
        );
        Map<String, String> kzMessages = Map.ofEntries(
                Map.entry("greeting", "Қош келдіңіз!"),
                Map.entry("login", "Логин: "),
                Map.entry("password", "Құпия сөз: "),
                Map.entry("userNotFound", "Пайдаланушы табылмады"),
                Map.entry("incorrectPassword", "Құпия сөз қате (шығу үшін 0 түймесін басыңыз)"),
                Map.entry("loginning", "Кіріс дұрыс. Есептік жазбаңызға қосылуда..."),
                Map.entry("addingMarks", "Бағалар сәтті қосылды"),
                Map.entry("successRegistering", "Курсқа сәтті тіркелді"),
                Map.entry("teacherInfo", "Курс мұғалімі"),
                Map.entry("addingUser", "Пайдаланушы қосылды"),
                Map.entry("removingUser", "Пайдаланушы жойылды"),
                Map.entry("publishingArticle", "Жаңа мақала жарияланды"),
                Map.entry("notifyingUser", "хабарлама алды"),
                Map.entry("consideringComplaint", "Шағымыңыз мақұлданды. Жауап күтіңіз."),
                Map.entry("errorRegistering", "Тіркеу сәтсіз аяқталды")
        );

        if (language == Language.EN) {
            return enMessages.get(text);
        }
        else if (language == Language.RU) {
            return ruMessages.get(text);
        }
        else {
            return kzMessages.get(text);
        }
    }
}
