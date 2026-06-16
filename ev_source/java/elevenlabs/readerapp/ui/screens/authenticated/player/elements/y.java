package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.ui.components.VoiceCircleKt;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16152b;

    public /* synthetic */ y(boolean z6, int i10) {
        this.f16151a = i10;
        this.f16152b = z6;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z SoundscapesButton$lambda$0$0;
        sn.z VoiceColoredCircle$lambda$0;
        switch (this.f16151a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                SoundscapesButton$lambda$0$0 = SoundscapesButtonKt.SoundscapesButton$lambda$0$0(this.f16152b, (l2) obj, (u2.m) obj2, intValue);
                return SoundscapesButton$lambda$0$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                VoiceColoredCircle$lambda$0 = VoiceCircleKt.VoiceColoredCircle$lambda$0(this.f16152b, (xk.b) obj, (u2.m) obj2, intValue2);
                return VoiceColoredCircle$lambda$0;
        }
    }
}
