package dollieson.heromodmaker.ModFiles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SkillCollection {
    private final static ArrayList<Skill> StatBuff = new ArrayList<>(List.of(new Skill[]{
            new Skill("Attack","Increases Attack"),
            new Skill("Defense","Increases Defense"),
            new Skill("Knowledge","Increases Knowledge"),
            new Skill("Spellpower","Increases Knowledge"),
            new Skill("Morale","Increases Morale"),
            new Skill("Luck","Increases Luck"),
            new Skill("Movement","Increases Movement"),
            new Skill("Sight","Increases Sight"),
            new Skill("Speed","Increases Speed"),
            new Skill("Gold","Increases Gold"),
            new Skill("Ore","Increases Ore"),
            new Skill("Wood","Increases Wood"),
            new Skill("Mercury","Increases Mercury"),
            new Skill("Crystal","Increases Crystal"),
            new Skill("Gems","Increases Gems"),
            new Skill("Sulphur","Increases Sulphur"),
            new Skill("Call of the Wild","Increases Call of the Wild"),
            new Skill("Call Elements","Increases Call Elements"),
    }));
    private final static ArrayList<Skill> CombatStatSkill = new ArrayList<>(List.of(new Skill[]{
            new Skill("Armorer"," Increases health of units in your army by 6% per rank. Additionally, your units 1 projectile protection for each rank of this skill, which makes them immune to damage from the next ranged attack."),
            new Skill("Offense"," Increases attack speed of melee units by 5% per rank. As your units lose health, they gain extra damage and movement speed, up to 15% damage and 5% speed per rank."),
            new Skill("Archery"," Gives ranged units in your army a chance to fire true-strike projectiles. Said projectiles strike in a 4x larger area and deal extra damage scaling to the size of the enemy, starting at 2x. Also increases their range of attack by 3 per rank. (Base chance is 4% per rank and higher for higher rank units)."),
            new Skill("Warding"," Large enemy unit attacks are ignored at around a rate of 5% per rank per power of the attack. While fighting an enemy hero, their spellpower is reduced by 5 per rank. Additionally, your units gain achance to resist damaging and debuffing spells."),
            new Skill("Leadership"," Increases morale of units in your army by +1 per rank. Morale gives your creatures a 1.5% chance per stat to enter high morale where they move twice as fast and attack twice as fast for 10 seconds. Additionally, it protects against terror."),
            new Skill("Fortune"," Increases the luck of creatures in your army by +1 per rank. Luck gives a 4% per stat chance for each attack by your creatures to be luck strikes, dealing 3x damage in a 4x larger area and with great knock-back."),
            new Skill("Combat"," Increases the Hero’s stats in the following: damage by +30% per rank; Health by 100 per rank; Attack Speed by 12.5% per rank; size, knockback, weight and attack width by 1 per rank."),
            new Skill("Tactics"," Pre v2.6: Increases the amount of creatures the hero can place on the battlefield at the start, and the size of each wave of reinforcements, by 15% for the first rank and +10% for each later rank. Post v2.6: Increases hero’s Command by +2 per rank. Command increases the amount of units the hero can control on the battlefield at a time by 100 power worth of units."),
            new Skill("Champion"," Makes elite units stronger. Elite units are any units with 9 power or higher."),
            new Skill("Legion"," Increases the health and damage of all creatures by +5 and +1 per rank respectively."),
            new Skill("Oligarchy"," Pre v2.6: Increases the health and damage of all creatures by 25% for the first rank and +15% for each later rank, but decreases the amount of creatures that can be fielded on the battlefield at any one time by 30% for each rank. Post v2.6: Increases the health and damage of all creatures by 25% for the first rank and 15% for each subsequent rank but reduces the hero’s Command by 1. Command increases the amount of units the hero can control on the battlefield at a time by 100 power worth of units."),
            new Skill("Swiftness"," Increases unit speed by +1 per rank. Each rank also gives them a 20% chance to avoid lethal damage and retreat instead."),
            new Skill("Swordsmith"," Increases the stats of offensively/aggressive oriented units marked by an axe in the top right corner. Their health and damage is increased by 10% and 15% respectively"),
            new Skill("Armorsmith"," Increases the stats of defensively oriented units marked by a shield in the top right corner. Their health and damage is increased by 15% and 10% respectively"),
            new Skill("Demoralise"," Gives -2 morale to enemy units in combat. Negative morale gives a chance for units to become afraid whenever they take damage."),
            new Skill("Tragedy"," Gives -2 luck to enemy units in combat. Negative luck removes the chance for lucky strikes and gives a chance for the unit to be interrupted by a small lightning strike when it’s about to attack."),
    }));

    private final static ArrayList<Skill> CombatEffectSkill = new ArrayList<>(List.of(new Skill[]{
            new Skill("Toxicology"," Makes poisonous blobs fall from the sky early in combat. Enemies hit will take a small bit of damage, but become poisoned, taking damage for the rest of combat. The blobs fall throughout combat, with rate decreasing quickly as combat goes on."),
            new Skill("Midas Touch"," When the hero and their mastery/proficiency unit attack, they have a chance to turn enemies into golden statues, instantly killing them and adding gold to the hero’s coffers. Chance increases per rank and is lowered for large enemies. Hero also gains +65 hp per rank."),
            new Skill("Elementalism"," Summons elementals throughout combat. Their type depends on the current terrain; and number, duration of combat and power depends on skill rank. The elementals come in from  he sides of the battlefield."),
            new Skill("Bloodlust"," Whenever creatures in the hero’s army die, the attack and speed of allied creatures is increased within a distance of 48. The base increase is 5% +0.5% per power of the killed creature, multiplied by rank. Each trigger is 10% less powerful than the prior."),
            new Skill("Swarming"," 15% chance per rank to create phantom duplicates of some of the creatures in the hero’s army. This chance is lowered for more powerful creatures and slightly lower for ranged creatures."),
            new Skill("Destruction"," Whenever creatures in the hero’s army die, they have a 15% chance per rank of casting a destructive spell which will deal damage to attackers"),
            new Skill("Recalcitrance"," Whenever creatures in the hero’s army die, they have a 15% chance plus 10% per additional rank to leave a vengeful spirit which will continue fighting for them. This spirit has 70% as much health and damage as the original creature, increased by 10% per additional rank."),
            new Skill("Hex"," Turns some enemy creatures into frogs at start of combat. Chance is 15% per rank. When a frog is killed, the original unit comes back, but retains the damage taken while being a frog."),
            new Skill("Hoard"," Improves the hero’s stats the more gold is hoarded. Hoarded gold is the amount of gold available when entering combat. The buff comes at three ranks. At 3000 gold, hero gains +2 attack and defence per rank. At 5000, the hero gains +1 luck per rank. At 8000, hero gains +5 spellpower and another +2 attack per rank."),
            new Skill("Call Beasts"," Summon beasts throughout combat. Type depends on the current terrain; and number, duration of combat and power of the beasts depends on skill rank. The beasts come in from the sides of the battlefield."),
            new Skill("Second Chance"," Whenever permanent living units die, they have a chance to become permanent undead units. Chance increases with skill rank, starting at 35%. The power of the new undead unit depends on the power of the dying unit and skill rank."),
    }));
    private final static ArrayList<Skill> SpellSkills = new ArrayList<>(List.of(new Skill[]{
            new Skill("Hydromancy"," Teaches your hero a Water spell (with strength according to rank) and increases the effect of Water spells by 65% per rank."),
            new Skill("Terramancy"," Teaches your hero an Earth spell (with strength according to rank) and increases the effect of Earth spells by 65% per rank."),
            new Skill("Aeromancy"," Teaches your hero an Air spell (with strength according to rank) and increases the effect of Air spells by 65% per rank."),
            new Skill("Pyromancy"," Teaches your hero a Fire spell (with strength according to rank) and increases the effect of Fire spells by 65% per rank."),
            new Skill("Sorcery"," Spellpower is increased by 20% of the mana spent per rank. Decreases spell cooldowns by 20% per rank, additionally reducing the cooldown on recasting the same spell by 20% per rank. Does not decrease the time between actions in hotseat combat."),
            new Skill("Wisdom"," Teaches the hero a spell from a choice of four spells. Additionally, it gives the hero +1 knowledge and +2 spellpower. Higher ranks teach more powerful spells."),
            new Skill("Mysticism"," Teaches the hero a mystical spell that cannot be learnt by other means. Additionally, increases the effectiveness of all spells by 25% per rank. Each rank teaches one of 10 special mystical spells with unique effects in a random order. Their mana cost varies, though early ranks more often give lower cost spells."),
            new Skill("Regeneration"," Increases normal mana regeneration by +15%, and additionally gives +2 mana regeneration each day."),
            new Skill("Summoning"," Teaches your hero a Summoning spell (with strength according to rank) and increases the effect of Summoning spells by 25% per rank."),
            new Skill("Potency"," Allows the hero to cast a Potent version of any spell they know, which costs twice as much mana. Additionally, makes units with magical attacks stronger. The power of Potent spells is increased by 50% per rank after the first. Increases health and damage of units with magical attacks by 8% per rank. These units have the Potency icon in their tooltip"),
            new Skill("Heavy Soul"," All permanent units gain Protection, taking zero damage from the first attack against them. They also become more knockback resistant throughout the rest of combat. Power of Earth spells is increased by 35%"),
            new Skill("Weightless Soul"," Flying units gain +10% health and damage per rank. Additionally, all units deal more knockback. Power of Air spells is increased by 35%."),
            new Skill("Fire Heart"," Gives the attacks of all units a chance to set the enemy units on fire. Power of Fire spells is increased by 35%."),
            new Skill("Frozen Heart"," Gives the attacks of all units a chance to freeze enemy units. Power of Water spells is increased by 35%."),
            new Skill("Resurrection"," Teaches a Resurrection spell, which will permanently resurrect friendly units. Each rank increases the power, and teaches a new spell with a larger effect and mana cost. Their cooldown is very long, and shared. When cast on corpses of permanent units, they will be resurrected permanently."),
            new Skill("Echo"," Whenever a spell is cast, an echo of that spell will be cast again later during combat. The power of the echoed spell depends on skill rank. Additionally, new echoes have a chance to make older echoes cast again, triggering echo cascades."),
            new Skill("Avatar"," Creates permanent elementals when the hero casts elemental spells they have increased power in. Number of units depends on mana cost, skill rank and proficiency in the element of the spell. Fire creates Blazes; Earth creates Grove Guards; Water creates Vital Snow; Air creates Doves."),
            new Skill("Buffer"," Gives the hero a mana buffer, making it so that the first 3 points of mana spent each fight isn’t spent, increased by 3 more per rank. Additionally, decreases the cost of Advanced and Ultimate spells by 10% per rank"),
    }));
    private final static ArrayList<Skill> CreationSkills = new ArrayList<>(List.of(new Skill[]{
            new Skill("Diplomacy"," After combat, allows your hero to hire some of the defeated enemy units for gold. The amount of hired units depends on rank and the size of the enemy army. The cost per unit starts at 105% and decreases by 25% per rank."),
            new Skill("Demonology"," After combat, allows the hero to sacrifice some of the experience gained to summon demonic reinforcements. Each time this skill is ranked up, you can pick one of several demons to summon. Additional ranks unlock more demons to choose from, increase the amount of demons offered and decrease the experience cost per demon."),
            new Skill("Necromancy"," After combat, allows the hero to spend mana on raising the undead. Each time this skill is ranked up, you can pick one of several undead to raise. Additional ranks unlock more undead to choose from, increase the amount of demons offered and decrease the mana cost per undead."),
            new Skill("Creation"," After combat, the hero will create some magical creatures for their army. The amount of creatures depends slightly on the power of the defeated army, but majorly with the amount of mana spent during combat. The amount is multiplied by skill rank."),
            new Skill("Dragonking"," Gives the hero dragonblood points based on the experience points they gain in battle, more per rank. Once 100 points have been collected, they are exchanged for a Red Dragon."),
            new Skill("Bloodwarping"," After combat, allows the hero to transform some of their basic creatures into elite creatures. The power gained via this transformation depends on the number of enemies killed, but especially on the power of your own lost units. For each unit, there’s a pre-set other unit that Bloodwarping will turn it into. This depends on the type of unit (humanoid, beast, etc.) and on its faction"),
            new Skill("Mastery"," Pre v2.6: Recruits <UNITNAME> for this hero's army over time, or <UPGRUNITNAME> if your hero already has any in their army, at an average rate of <PerWeek> per week per rank. <UNITNAME> and <UPGRUNITNAME> gain +5% health and damage for each rank. Post v2.6: Increases hero’s Proficiency by +2. Proficiency recruits the hero’s specialty units over time, at a rate of X units per week per Proficiency, this rate depends on the power of the unit. These units also gain +3% health and damage per Proficiency."),
            new Skill("Blight Ritual"," Any unit entering the hero’s army will turn into blighted units, roughly retaining the same total power. Higher ranks increase the speed, attack and health of Blighted creatures by 5% per rank."),
            new Skill("Mercurial"," Spends 1 mercury each day (if possible) and creates 4 Mercurials +2 for each rank for the hero’s army."),
            new Skill("Hegemony"," After combat, allows the hero to spend sulphur to create <UNITNAME> for their army. Number of created units depends on the size of the defeated army multiplied by skill rank. The sulphur cost is significantly less than what the units would cost otherwise. In case less than one unit would be created, tier 1 units are offered instead."),
            new Skill("Crystal Assembly"," Whenever the hero picks up overworld resources, Crystalthemums are added to their army. The number is doubled when picking up Crystals. Base rate is one per rank per pick-up. Rare pick-ups like treasure chests and bonfires instead give other units.")
    }));
    private final static ArrayList<Skill> MacroSkills = new ArrayList<>(List.of(new Skill[]{
            new Skill("Estates"," Gives your hero 350 gold each day per rank regardless if they are in town, camped, or tired."),
            new Skill("Recruitment"," Each rank will increase the available units by 20% of their base weekly growth. The effect applies across all towns for every hero, and several heroes with Recruitment will stack their effects."),
            new Skill("Planning"," Decreases the cost of buildings in all towns by 20% per rank, both for gold and rare resource costs. The hero does not need to be present in town. Several heroes with planning have their effects stack."),
            new Skill("Royalty"," Decreases the resource cost of creating units by 20% per rank in all towns. The hero does not need to be present in town. Several heroes with Royalty have their effects stack."),
            new Skill("Mason"," While the hero is camped, they will create and reinforce a fort. The fort receives units each day the hero remains camped. The units cannot be removed from the fort. The amount and type of units depends on skill rank."),
            new Skill("Banditry"," Gives 2 bandits per rank per day and whenever the hero gains a level. Teaches the Ambush adventure map spell which leads to combat against a non-affiliated hero available for hire in one of your opponents taverns. If defeated, your enemy will have to recruit a lower level hero. Additionally, a successful ambush creates gold that can be picked up"),
            new Skill("Spatial Rift"," Teaches Spatial Rift, an overworld spell that allows the hero to swap units and place with your other heroes. When swapping units, the amount of units transported depends on the rank of this skill, with 150 power worth of units per rank. This spell can target heroes that do not know Spatial Rift"),
            new Skill("Infest"," Whenever the hero visits a mine, vault, monument or adventure map building, they get the option of turning it into a Spore Mound. Spore Mounds create Dunce Caps each week, the amount created is increased by higher ranks of this skill across all of your heroes. Transforming the building is irreversible. A building can be transformed without owning it, as long as it does not have any guards."),
            new Skill("Exploitation"," Allows this hero to deposit units in mines. Units in mines improve the output of the mine. Mines are improved according to the sum of power of the deposited units. There are five power thresholds, each of which doubles production on some days of the week. Additionally, improved mines also produce gold each day, the rate of which increases with skill rank. Several heroes with Exploitation have their effects stack when it comes to gold gain."),
            new Skill("Antagonism"," Teaches a special spell, which allows the hero to enter a duel against the strongest hero of any opponent. Only part of the two heroes’ armies enter the duel, and while neither of the heroes die, losses are permanent. The winning hero gains experience based on the rank of the skill. Additionally, the number of units brought into combat depends on skill rank."),
    }));
    private final static ArrayList<Skill> MiscSkills = new ArrayList<>(List.of(new Skill[]{
            new Skill("Healing"," Each rank will raise 20% of casualties back into the hero’s army after winning a battle. The effect has diminishing returns per rank, each reducing the amount by 20% compared to the previous."),
            new Skill("Learning"," Increases the rate at which your hero gains experience by 25% per rank. This applies to combat experience and experience from objects on the adventure map."),
            new Skill("Logistics"," Increases the distance your hero can travel each day by 5 tiles per rank."),
            new Skill("Scouting"," After combat, hero gains up to +4 movement per rank. The boost becomes smaller when used, but returns to full over time. Also allows your hero to see 2 tiles per rank further on the adventure map, and shows accurate numbers of units in hostile armies."),
            new Skill("Plunder"," Lets your hero loot gold and artifacts after combat. The gold and artifacts are scattered on the adventure map after combat. The amount of gold gained depends on skill rank and the strength of the defeated enemy. Each rank increases gold gained linearly. Some of the gold will be replaced with artifacts, the power of which is related to skill rank."),
            new Skill("Engineering"," Increases the speed of the Ballista and First Aid Tent by 50% per rank. The Ballista deals +50% damage per rank. The First Aid Tent can heal one more unit per activation per rank. Units have +5% chance to be saved by the First Aid Tent per rank."),
            new Skill("Bodyguards"," Pre v2.6: Adds bodyguards to the hero's army during combat. Their power is based on the power difference between this hero's and the main hero's army (whichever of your heroes has the most powerful army). The bodyguards consist of various faction units. (Gives 50% of the power difference between this and the main hero's army, up to 200 power per rank). Post v2.6: Increases hero’s Entourage by +2 per rank, a support hero skill, giving them extra bodyguard units during combat. Entourage gives up to +100 power worth of units per stat. This number depends on the number of days that have passed. The number is reduced when bodyguard units die in combat, but regenerates with time. Importantly, there is a large penalty if this hero holds the majority of your units."),
            new Skill("Devour"," Teaches your hero a special Devour ability, which Devours friendly units but gives temporary and permanent stat buffs. Devour can be used once a day during combat. Devour friendly creatures to give the hero a permanent boost to attack and defence. Sufficient power worth of units must be devoured at once to give a permanent buff. Each additional rank reduces the time cost required to gain permanent buffs."),
            new Skill("Dizzy Tune"," Teaches your hero a special Dizzy Tune ability that can be used once every two days. Confuses a large group of enemy creatures. Higher ranks increases the total power worth of affected creatures."),
            new Skill("Enchanting"," After combat, gives the hero a chance to gain or upgrade an artifact. The rate of this effect depends on the rank of the skill. It starts at once every 3 fights; each additional rank reduces cooldown by 50%. The more artifact slots the hero has filled with artifacts, the higher chance to upgrade an artifact, the hero will never be offered an artifact for a slot they already have filled."),
            new Skill("Creativity"," After combat, gives the hero a chance to learn a new skill at a small experience cost. The offered skills are often not within the normal skill tree. The base rate is one skill learnt every five battles, and is reduced by 50% for each additional rank. The skill will cost one tenth of the experience required to level up."),
            new Skill("Tinker"," Gives the hero Amberodes and Dactylodes as bodyguards. The total power of bodyguards is based on skill rank and the level of the hero, and starts at 35 + 5 per level, multiplied by skill rank. Bodyguards that die during combat are replenished over the course of the next days."),
            new Skill("Lovely Tune"," Teaches your hero a special Lovely Tune ability that can be used once every two days. Lovely Tune buffs and protects friendly units for some time. The buff makes the creatures immune and increases speed and damage. Higher ranks increase the total power worth of affected creatures."),
    }));
    private final static ArrayList<Skill> FactionSkills = new ArrayList<>(List.of(new Skill[]{
            new Skill("Rallying"," Gives rallying to all friendly units close to the hero. This increases health, damage and speed temporarily by 15% per rank."),
            new Skill("Blessing"," Blesses all friendly units after casting a spell. This increases health, damage and speed temporarily by 25% per rank. Duration is also increased with higher ranks."),
            new Skill("Wild Communion"," Teaches Wild Call, which summons animals into battle when used. Wild Call spell costs 0 mana but has a 2 day cooldown. This spell summons animals onto the battlefield. If they survive after combat, you keep them as Anima. Number and quality of animals increases with skill level."),
            new Skill("Lifespark"," Whenever the hero casts a spell, the hero additionally heals nearby units and summons animals onto the battlefield. If the animals survive after combat, you keep them as Anima. Strength increases with skill level."),
            new Skill("Alchemy"," The hero gains Ore after every battle. Ore can be spent in the Aether Forge in town to create units, spells or other effects. Amount of Ore increases with skill level."),
            new Skill("Aethermancy"," The hero gains a special resource named Aether after every battle. This resource can be used with the Aether Forge in town to create units, spells or other effects. Amount of Aether increases with skill level."),
            new Skill("Bane"," The hero passes the Curse of Undead onto enemies through their attacks, which turns enemy units into permanent undead units. When the hero dies, a group of skeletons are summoned. Stronger units create stronger undead units. Increases hero’s health by 60 and damage by 3 per rank, and teaches the hero charge."),
            new Skill("Malediction"," Spreads the Curse of Undead when casting spells which turns enemy units into permanent undead units. Curse of Undead is granted to friendly or enemy units depending on the spell. Friendly units with this Curse pass it onto enemies through their attacks. Stronger units create stronger undead units. The number of units that are given the Curse depends on the skill rank."),
            new Skill("Firegating"," Teaches Firegating, which teleports friendly units across the battlefield when used. Firegating costs 0 mana and has a 1 day cooldown. The spell teleports friendly units across the battlefield and creates an explosion. Size of the portal and strength of explosion increase with skill level."),
            new Skill("Firetrapping"," Gives the hero a special Firetrapping spell. The spell teleports enemy units across the battlefield and weakens them. Size of the portal and negative effects increase with skill level."),
            new Skill("Might"," Gives the hero 0-mana spells for use in battle. Strength and number of abilities increase with skill level. Teaches Charge at rank I, Freedom Call at rank II and Quake at rank III. Each spell costs 0 mana and has a multi-day cooldown."),
            new Skill("Ardour"," Gives the hero 0-mana spells for use in battle. Strength and number of abilities increase with skill level. Teaches Bellow at rank I, Call of Champions at rank II and Quake at rank III. Each spell costs 0 mana and has a multi-day cooldown."),
            new Skill("Hunting"," The hero has a chance to pick up hunting trophies whenever they defeat armies with beasts in them. Additionally allows the hero to track down hidden beasts. The hero is able to find the footsteps of hidden herds of beasts. When tracked down and defeated in combat, the hero will collect powerful artifacts. The chance of finding artifacts and the power of these increases with skill rank."),
            new Skill("Taming"," Units in the hero’s army are able to convert defeated beasts to fight for their side. Additionally allows the hero to track down hidden beasts. The hero is able to find the footsteps of hidden herds of beasts. When tracked down and defeated in combat, the hero is able to tame a large contingent of their army. The chance for beasts to be tamed increases with skill rank."),
            new Skill("Shadowcloning"," Teaches the hero Shadowcloning, which summons temporary shadow-clones of the hero and nearby allies when used in battle.Additionally, the hero has a chance to create shadowclones of any enemy they strike. The spell always targets the hero and nearby units, but their shadowclones can be sent to any desired spot on the battlefield. Number and strength of shadows increases with skill level."),
            new Skill("Shadowcasting"," Teaches the hero Shadowcloning, which summons temporary shadow-clones of enemy units in the desired area of the battlefield, which fight for your side. Strength of shadows increases with skill level."),
            new Skill("Siren Song"," Teaches the hero Siren Song, which permanently takes control of enemy units close to the hero during battle. Additionally, the attacks of the hero gain a chance to charm enemy units for the rest of the fight. Siren Song can be used once every 3 days. The Song must be cast during battle, and only works if your hero is alive. You can keep the enemy units affected by Siren Song after battle. The higher the rank of Siren Song, the more enemy units are affected."),
            new Skill("Conflux"," Whenever the hero casts a spell, some elementals of the same element as the spell will be summoned and fight for you for a short time. Higher skill levels and spells that cost more mana give more elementals. Soul of the Earth: Whenever a dwarven unit dies, they leave behind a soul. Several souls combine to summon Rock Pummelers that will continue the fight. Skill level increases the amount of rock elementals and their chance of becoming permanent."),
            new Skill("Grudge"," Whenever a dwarven unit dies, they leave behind a soul, which, when activated by a spell, becomes a vengeful spirit. Souls turn into vengeful spirits after a random amount of time, or shortly after a spell is cast. Strength of spirits increases with skill level."),
            new Skill("Union"," Gives the hero +120 health per rank. Whenever a unit close to the hero is about to die, the hero will save them from death. Saving an unit gives that unit 20 health, taken from the hero’s health pool. Additionally the unit will become immune for 3 seconds."),
            new Skill("Balance"," Teaches Balance spell, which selects an area of the battlefield. Any friendly units close to death will be saved within this area. A saved unit gains 10 health and will become immune for 5 seconds. The Balance field has no time limit, but has a maximum number of units that can be saved. Higher ranks create a larger area and can save more creatures."),
            new Skill("Speaker"," Gives the hero +60 health per rank. Attacks by the hero spread fear. Any feared enemy has a chance to attack nearby allies while fleeing. Higher ranks increase the spread of fear and the chance for feared enemies to attack allies."),
            new Skill("Watcher"," Gives a special spell that costs 5 mana. The spell spreads mad terror among enemies, making them attack both friend and foe. Higher ranks increase the number of maddened enemies, and gives a chance for those affected to join your side."),
    }));

    private static final ArrayList<Skill> CustomSkill = new ArrayList<>();

    public static ArrayList<Skill> getCombatEffectSkill() {
        return CombatEffectSkill;
    }

    public static ArrayList<Skill> getCreationSkills() {
        return CreationSkills;
    }

    public static ArrayList<Skill> getCustomSkill() {
        return CustomSkill;
    }

    public static ArrayList<Skill> getFactionSkills() {
        return FactionSkills;
    }

    public static ArrayList<Skill> getMacroSkills() {
        return MacroSkills;
    }

    public static ArrayList<Skill> getMiscSkills() {
        return MiscSkills;
    }

    public static ArrayList<Skill> getSpellSkills() {
        return SpellSkills;
    }

    public static ArrayList<Skill> getCombatStatSkill() {
        return CombatStatSkill;
    }

    public static ArrayList<Skill> getStatBuff() {
        return StatBuff;
    }
    public static ArrayList<Skill> getAllSkills(){
        ArrayList<Skill> AllSkill = new ArrayList<>();
        AllSkill.addAll(StatBuff);
        AllSkill.addAll(CombatStatSkill);
        AllSkill.addAll(SpellSkills);
        AllSkill.addAll(MiscSkills);
        AllSkill.addAll(MacroSkills);
        AllSkill.addAll(FactionSkills);
        AllSkill.addAll(CustomSkill);
        AllSkill.addAll(CombatEffectSkill);
        AllSkill.addAll(MiscSkills);
        return AllSkill;
    }
    public static void AddCustomSkill(Skill Custom){
        CustomSkill.add(Custom);
    }
}
