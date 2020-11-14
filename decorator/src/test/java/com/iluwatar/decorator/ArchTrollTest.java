package com.iluwatar.decorator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class ArchTrollTest {
    @Test
    public void createTrollWithClubAnArch_getAttackPower_isDelegatedToDecoratedTrolls() {
        final Troll simpleTroll = spy(new SimpleTroll());
        final Troll clubbedTroll = spy(new ClubbedTroll(simpleTroll));
        final Troll clubbedArchTroll = new ArchTroll(clubbedTroll);

        assertEquals(30, clubbedArchTroll.getAttackPower());

        verify(simpleTroll, times(1)).getAttackPower();
        verify(clubbedTroll, times(1)).getAttackPower();
    }


    @Test
    public void createTrollWithClubAnArch_attack_attackIsDelegatedToDecoratedTrolls() {
        final Troll simpleTroll = spy(new SimpleTroll());
        final Troll clubbedTroll = spy(new ClubbedTroll(simpleTroll));
        final Troll clubbedArchTroll = new ArchTroll(clubbedTroll);

        clubbedArchTroll.attack();

        verify(simpleTroll, times(1)).attack();
        verify(clubbedTroll, times(1)).attack();
    }

    @Test
    public void createTrollWithClubAnArch_fleeBattle_isDelegatedToDecoratedTrolls() {
        final Troll simpleTroll = spy(new SimpleTroll());
        final Troll clubbedTroll = spy(new ClubbedTroll(simpleTroll));
        final Troll clubbedArchTroll = new ArchTroll(clubbedTroll);

        clubbedArchTroll.fleeBattle();

        verify(simpleTroll, times(1)).fleeBattle();
        verify(clubbedTroll, times(1)).fleeBattle();
        verifyNoMoreInteractions(simpleTroll);
    }
}