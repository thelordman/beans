package me.mrscopes.beans.utilities

import me.mrscopes.beans.Beans
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer
import org.bukkit.ChatColor
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player

fun String.color() = Component.text(ChatColor.translateAlternateColorCodes('&', this))
fun Component.plainText() = PlainTextComponentSerializer.plainText().serialize(this)
fun Player.mongoPlayer() = Beans.mongo.mongoPlayers[this.uniqueId]
fun OfflinePlayer.mongoPlayer() = Beans.mongo.mongoPlayers[this.uniqueId] ?: Beans.mongo.playerFromDatabase(this.uniqueId)