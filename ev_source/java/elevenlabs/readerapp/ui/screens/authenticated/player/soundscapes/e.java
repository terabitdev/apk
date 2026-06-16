package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16321b;

    public /* synthetic */ e(ho.l lVar, int i10) {
        this.f16320a = i10;
        this.f16321b = lVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z FilterChips$lambda$0$0$0;
        z SoundscapeList$lambda$0$0$0;
        z SoundscapeList$lambda$0$1$0;
        switch (this.f16320a) {
            case 0:
                FilterChips$lambda$0$0$0 = SoundscapesScreenKt.FilterChips$lambda$0$0$0(this.f16321b, (SoundscapeCategory) obj);
                return FilterChips$lambda$0$0$0;
            case 1:
                SoundscapeList$lambda$0$0$0 = SoundscapesScreenKt.SoundscapeList$lambda$0$0$0(this.f16321b, (SoundscapeCategory) obj);
                return SoundscapeList$lambda$0$0$0;
            default:
                SoundscapeList$lambda$0$1$0 = SoundscapesScreenKt.SoundscapeList$lambda$0$1$0(this.f16321b, ((Float) obj).floatValue());
                return SoundscapeList$lambda$0$1$0;
        }
    }
}
