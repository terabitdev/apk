package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import ho.q;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import r1.z1;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16323a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SoundscapesContract.State f16324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f16325c;

    public /* synthetic */ g(ho.l lVar, SoundscapesContract.State state) {
        this.f16325c = lVar;
        this.f16324b = state;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z SoundscapesUI$lambda$1;
        z SoundscapeList$lambda$0$2$0$1;
        switch (this.f16323a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                SoundscapesUI$lambda$1 = SoundscapesScreenKt.SoundscapesUI$lambda$1(this.f16325c, this.f16324b, (z1) obj, (u2.m) obj2, intValue);
                return SoundscapesUI$lambda$1;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                SoundscapeList$lambda$0$2$0$1 = SoundscapesScreenKt.SoundscapeList$lambda$0$2$0$1(this.f16324b, this.f16325c, (t1.b) obj, (u2.m) obj2, intValue2);
                return SoundscapeList$lambda$0$2$0$1;
        }
    }

    public /* synthetic */ g(SoundscapesContract.State state, ho.l lVar) {
        this.f16324b = state;
        this.f16325c = lVar;
    }
}
