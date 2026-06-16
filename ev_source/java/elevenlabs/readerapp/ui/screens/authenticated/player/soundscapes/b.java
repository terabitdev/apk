package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import ho.q;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16314a;

    public /* synthetic */ b(int i10) {
        this.f16314a = i10;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z lambda__664115423$lambda$0;
        String FilterChips$lambda$0$1;
        switch (this.f16314a) {
            case 0:
                lambda__664115423$lambda$0 = ComposableSingletons$SoundscapesScreenKt.lambda__664115423$lambda$0((t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return lambda__664115423$lambda$0;
            default:
                FilterChips$lambda$0$1 = SoundscapesScreenKt.FilterChips$lambda$0$1((SoundscapeCategory) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return FilterChips$lambda$0$1;
        }
    }
}
