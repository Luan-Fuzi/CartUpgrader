package com.luan_fuzi.cartupgrader.commands;

import com.luan_fuzi.cartupgrader.CartUpgrader;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;

import static net.minecraft.server.command.CommandManager.literal;

public class CartCommand {
//    public static void register(CommandDispatcher<ServerCommandSource> dispatcher){
//        dispatcher.register(literal("CartUpgrade").then(literal("false")).requires(c->c.hasPermissionLevel(4))
//                .executes(c-> CartUpgrader.Status=0));
//        dispatcher.register(literal("CartUpgrade").then(literal("true")).requires(c->c.hasPermissionLevel(4))
//                .executes(c-> CartUpgrader.Status=1));
//        dispatcher.register(literal("CartUpgrade").then(literal("player")).requires(c->c.hasPermissionLevel(4))
//                .executes(c-> CartUpgrader.Status=2));
//    }



}
