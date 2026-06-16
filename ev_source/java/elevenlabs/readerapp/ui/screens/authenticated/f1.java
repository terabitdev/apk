package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.ChaptersSectionKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.CalloutKt;
import io.elevenlabs.ui.components.CalloutType;
import io.elevenlabs.ui.components.SearchButtonKt;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements ho.p {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15580f;

    public /* synthetic */ f1(int i10, ho.a aVar, i3.t tVar, ButtonIconSize buttonIconSize, int i11, int i12) {
        this.f15575a = 2;
        this.f15576b = i10;
        this.f15579e = aVar;
        this.f15580f = tVar;
        this.Y = buttonIconSize;
        this.f15577c = i11;
        this.f15578d = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z OnboardingScreenUI$lambda$1;
        sn.z Callout$lambda$3;
        sn.z ChaptersSection$lambda$4;
        switch (this.f15575a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OnboardingScreenUI$lambda$1 = OnboardingScreenKt.OnboardingScreenUI$lambda$1((ho.l) this.f15579e, this.f15576b, (OnboardingState) this.f15580f, (Long) this.Y, this.f15577c, this.f15578d, (u2.m) obj, intValue);
                return OnboardingScreenUI$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Callout$lambda$3 = CalloutKt.Callout$lambda$3((CalloutType) this.f15579e, this.f15576b, (ho.a) this.f15580f, (i3.t) this.Y, this.f15577c, this.f15578d, (u2.m) obj, intValue2);
                return Callout$lambda$3;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                return SearchButtonKt.a(this.f15576b, (ho.a) this.f15579e, (i3.t) this.f15580f, (ButtonIconSize) this.Y, this.f15577c, this.f15578d, (u2.m) obj, intValue3);
            default:
                int intValue4 = ((Integer) obj2).intValue();
                ChaptersSection$lambda$4 = ChaptersSectionKt.ChaptersSection$lambda$4((String) this.f15579e, (List) this.f15580f, (i3.t) this.Y, this.f15576b, this.f15577c, this.f15578d, (u2.m) obj, intValue4);
                return ChaptersSection$lambda$4;
        }
    }

    public /* synthetic */ f1(Object obj, int i10, Object obj2, Object obj3, int i11, int i12, int i13) {
        this.f15575a = i13;
        this.f15579e = obj;
        this.f15576b = i10;
        this.f15580f = obj2;
        this.Y = obj3;
        this.f15577c = i11;
        this.f15578d = i12;
    }

    public /* synthetic */ f1(String str, List list, i3.t tVar, int i10, int i11, int i12) {
        this.f15575a = 3;
        this.f15579e = str;
        this.f15580f = list;
        this.Y = tVar;
        this.f15576b = i10;
        this.f15577c = i11;
        this.f15578d = i12;
    }
}
