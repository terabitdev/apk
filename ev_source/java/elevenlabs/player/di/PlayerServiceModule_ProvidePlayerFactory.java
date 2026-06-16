package io.elevenlabs.player.di;

import android.content.Context;
import androidx.room.m0;
import g8.s1;
import io.elevenlabs.player.media.DynamicLoadControl;
import r8.g0;
import ul.c;
import ul.f;
import w7.h1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PlayerServiceModule_ProvidePlayerFactory implements c {
    private final f contextProvider;
    private final f dynamicLoadControlProvider;
    private final f mediaSourceFactoryProvider;
    private final f renderersFactoryProvider;

    private PlayerServiceModule_ProvidePlayerFactory(f fVar, f fVar2, f fVar3, f fVar4) {
        this.contextProvider = fVar;
        this.renderersFactoryProvider = fVar2;
        this.mediaSourceFactoryProvider = fVar3;
        this.dynamicLoadControlProvider = fVar4;
    }

    public static PlayerServiceModule_ProvidePlayerFactory create(f fVar, f fVar2, f fVar3, f fVar4) {
        return new PlayerServiceModule_ProvidePlayerFactory(fVar, fVar2, fVar3, fVar4);
    }

    public static h1 providePlayer(Context context, s1 s1Var, g0 g0Var, DynamicLoadControl dynamicLoadControl) {
        h1 providePlayer = PlayerServiceModule.INSTANCE.providePlayer(context, s1Var, g0Var, dynamicLoadControl);
        m0.n(providePlayer);
        return providePlayer;
    }

    @Override // rn.a
    public h1 get() {
        return providePlayer((Context) this.contextProvider.get(), (s1) this.renderersFactoryProvider.get(), (g0) this.mediaSourceFactoryProvider.get(), (DynamicLoadControl) this.dynamicLoadControlProvider.get());
    }
}
