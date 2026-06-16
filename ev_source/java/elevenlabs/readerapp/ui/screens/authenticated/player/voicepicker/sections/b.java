package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import ho.p;
import ho.q;
import i1.g0;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import r1.z1;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f16503b;

    public /* synthetic */ b(p pVar, int i10) {
        this.f16502a = i10;
        this.f16503b = pVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z AnimatedSlideDownWithFadeVisibility$lambda$2;
        z AnimatedSlideBottomVisibility$lambda$2;
        z AnimatedSlideTopVisibility$lambda$2;
        z AnimatedSlideTopWithFadeVisibility$lambda$2;
        z AnimatedFadeVisibility$lambda$0;
        z CenteredContentScaffold$lambda$1;
        switch (this.f16502a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                return VoicePickerExploreSectionTitleKt.a(this.f16503b, (t1.b) obj, (m) obj2, intValue);
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                AnimatedSlideDownWithFadeVisibility$lambda$2 = AnimatedVisibilityContainersKt.AnimatedSlideDownWithFadeVisibility$lambda$2(this.f16503b, (g0) obj, (m) obj2, intValue2);
                return AnimatedSlideDownWithFadeVisibility$lambda$2;
            case 2:
                int intValue3 = ((Integer) obj3).intValue();
                AnimatedSlideBottomVisibility$lambda$2 = AnimatedVisibilityContainersKt.AnimatedSlideBottomVisibility$lambda$2(this.f16503b, (g0) obj, (m) obj2, intValue3);
                return AnimatedSlideBottomVisibility$lambda$2;
            case 3:
                int intValue4 = ((Integer) obj3).intValue();
                AnimatedSlideTopVisibility$lambda$2 = AnimatedVisibilityContainersKt.AnimatedSlideTopVisibility$lambda$2(this.f16503b, (g0) obj, (m) obj2, intValue4);
                return AnimatedSlideTopVisibility$lambda$2;
            case 4:
                int intValue5 = ((Integer) obj3).intValue();
                AnimatedSlideTopWithFadeVisibility$lambda$2 = AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility$lambda$2(this.f16503b, (g0) obj, (m) obj2, intValue5);
                return AnimatedSlideTopWithFadeVisibility$lambda$2;
            case 5:
                int intValue6 = ((Integer) obj3).intValue();
                AnimatedFadeVisibility$lambda$0 = AnimatedVisibilityContainersKt.AnimatedFadeVisibility$lambda$0(this.f16503b, (g0) obj, (m) obj2, intValue6);
                return AnimatedFadeVisibility$lambda$0;
            default:
                int intValue7 = ((Integer) obj3).intValue();
                CenteredContentScaffold$lambda$1 = CenteredContentScaffoldKt.CenteredContentScaffold$lambda$1(this.f16503b, (z1) obj, (m) obj2, intValue7);
                return CenteredContentScaffold$lambda$1;
        }
    }
}
