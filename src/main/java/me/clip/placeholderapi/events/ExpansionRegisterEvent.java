/*
 * This file is part of PlaceholderAPI
 *
 * PlaceholderAPI
 * Copyright (c) 2015 - 2021 PlaceholderAPI Team
 *
 * PlaceholderAPI free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlaceholderAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package me.clip.placeholderapi.events;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Indicates that a {@link PlaceholderExpansion} has been registered by
 * PlaceholderAPI.
 */
public final class ExpansionRegisterEvent extends Event implements Cancellable {

  @NotNull
  private static final HandlerList HANDLERS = new HandlerList();
  @NotNull
  private final PlaceholderExpansion expansion;
  private boolean cancelled;

  public ExpansionRegisterEvent(@NotNull final PlaceholderExpansion expansion) {
    this.expansion = expansion;
  }

  @NotNull
  public static HandlerList getHandlerList() {
    return HANDLERS;
  }
  
  /**
   * The {@link PlaceholderExpansion expansion} that was registered.
   * 
   * @return The {@link PlaceholderExpansion} instance.
   */
  @NotNull
  public PlaceholderExpansion getExpansion() {
    return expansion;
  }

  @Override
  public boolean isCancelled() {
    return cancelled;
  }

  @Override
  public void setCancelled(boolean cancelled) {
    this.cancelled = cancelled;
  }

  @NotNull
  @Override
  public HandlerList getHandlers() {
    return HANDLERS;
  }

}
