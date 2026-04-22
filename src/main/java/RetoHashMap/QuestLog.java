package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;// Mapa: ID → Quest

    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        quests.put(quest.getId(), quest);
    }

    public Quest getQuest(String questId) {
        return quests.get(questId);
    }

    public void completeQuest(String questId) {

        if (quests.get(questId) != null) {
            var quest = quests.get(questId);
            quest.setCompleted(true);
        }
    }

    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}