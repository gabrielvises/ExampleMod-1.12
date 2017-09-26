/**
    Copyright (C) 2017 by jabelar

    This file is part of jabelar's Minecraft Forge modding examples; as such,
    you can redistribute it and/or modify it under the terms of the GNU
    General Public License as published by the Free Software Foundation,
    either version 3 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    For a copy of the GNU General Public License see <http://www.gnu.org/licenses/>.
*/
package com.blogspot.jabelarminecraft.examplemod.fluids;

import com.blogspot.jabelarminecraft.examplemod.init.ModFluids;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack;

// TODO: Auto-generated Javadoc
public class FluidHandlerSlimeBag extends FluidHandlerItemStack
{
	
	/**
	 * Instantiates a new fluid handler slime bag.
	 *
	 * @param parContainerStack the container stack
	 * @param parCapacity the capacity
	 */
	public FluidHandlerSlimeBag(ItemStack parContainerStack, int parCapacity) 
	{
		super(parContainerStack, parCapacity);
		setFluid(new FluidStack(ModFluids.SLIME, 0)); // start empty

//		// DEBUG
//		System.out.println("Constructing FluidHandlerSlimeBag with FluidStack = "+getFluid()+" capacity = "+capacity+" and container = "+container);
	}
	
    /* (non-Javadoc)
     * @see net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack#setContainerToEmpty()
     */
    @Override
	protected void setContainerToEmpty()
    {
        container.getTagCompound().removeTag(FLUID_NBT_KEY);
    }

    /* (non-Javadoc)
     * @see net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack#canFillFluidType(net.minecraftforge.fluids.FluidStack)
     */
    @Override
	public boolean canFillFluidType(FluidStack fluid)
    {
        return (fluid.getFluid() == ModFluids.SLIME);
    }
}