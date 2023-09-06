package max.panda.cloaking.init;

import max.panda.cloaking.CloakingMod;
import max.panda.cloaking.enchants.CloakingEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CloakingMod.MODID);

    public static final RegistryObject<Enchantment> CLOAKING = ENCHANTMENTS.register("cloaking", CloakingEnchantment::new);
}