package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import ho.q;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import r1.l2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16333b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f16332a = i10;
        this.f16333b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z SoundscapesUI$lambda$0$0;
        z SoundscapeList$lambda$0$2$0$0;
        switch (this.f16332a) {
            case 0:
                SoundscapesUI$lambda$0$0 = SoundscapesScreenKt.SoundscapesUI$lambda$0$0((ho.l) this.f16333b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return SoundscapesUI$lambda$0$0;
            default:
                SoundscapeList$lambda$0$2$0$0 = SoundscapesScreenKt.SoundscapeList$lambda$0$2$0$0((SoundscapesContract.State) this.f16333b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return SoundscapeList$lambda$0$2$0$0;
        }
    }
}
