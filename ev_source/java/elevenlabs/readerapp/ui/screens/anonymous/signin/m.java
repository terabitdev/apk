package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SoundscapesButtonKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14884c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14885d;

    public /* synthetic */ m(ho.l lVar, int i10, boolean z6) {
        this.f14882a = 1;
        this.f14883b = z6;
        this.f14885d = lVar;
        this.f14884c = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z PasswordRequirementItem$lambda$1;
        z AutoFullscreenRow$lambda$0;
        z SoundscapesButton$lambda$1;
        switch (this.f14882a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PasswordRequirementItem$lambda$1 = EmailSignUpFormUIKt.PasswordRequirementItem$lambda$1((String) this.f14885d, this.f14883b, this.f14884c, (u2.m) obj, intValue);
                return PasswordRequirementItem$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                AutoFullscreenRow$lambda$0 = PlayerPreferencesScreenKt.AutoFullscreenRow$lambda$0(this.f14883b, (ho.l) this.f14885d, this.f14884c, (u2.m) obj, intValue2);
                return AutoFullscreenRow$lambda$0;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                SoundscapesButton$lambda$1 = SoundscapesButtonKt.SoundscapesButton$lambda$1((ho.a) this.f14885d, this.f14883b, this.f14884c, (u2.m) obj, intValue3);
                return SoundscapesButton$lambda$1;
        }
    }

    public /* synthetic */ m(int i10, boolean z6, int i11, Object obj) {
        this.f14882a = i11;
        this.f14885d = obj;
        this.f14883b = z6;
        this.f14884c = i10;
    }
}
