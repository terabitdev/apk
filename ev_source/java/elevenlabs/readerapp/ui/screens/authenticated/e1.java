package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceFiltersDialogKt;
import io.elevenlabs.ui.components.SelectKt;
import java.util.List;
import java.util.Set;
import r1.z1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15394a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15396c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15398e;

    public /* synthetic */ e1(int i10, List list, Set set, ho.l lVar) {
        this.f15395b = i10;
        this.f15397d = list;
        this.f15398e = set;
        this.f15396c = lVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z OnboardingScreenUI$lambda$0;
        sn.z filterChips$lambda$0;
        sn.z Select$lambda$9;
        switch (this.f15394a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                OnboardingScreenUI$lambda$0 = OnboardingScreenKt.OnboardingScreenUI$lambda$0((OnboardingState) this.f15397d, this.f15395b, (ho.l) this.f15396c, (Long) this.f15398e, (z1) obj, (u2.m) obj2, intValue);
                return OnboardingScreenUI$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                filterChips$lambda$0 = VoiceFiltersDialogKt.filterChips$lambda$0(this.f15395b, (List) this.f15397d, (Set) this.f15398e, (ho.l) this.f15396c, (t1.b) obj, (u2.m) obj2, intValue2);
                return filterChips$lambda$0;
            default:
                int intValue3 = ((Integer) obj3).intValue();
                Select$lambda$9 = SelectKt.Select$lambda$9((ho.p) this.f15397d, (String) this.f15396c, this.f15395b, (ho.p) this.f15398e, (r1.s) obj, (u2.m) obj2, intValue3);
                return Select$lambda$9;
        }
    }

    public /* synthetic */ e1(ho.p pVar, String str, int i10, ho.p pVar2) {
        this.f15397d = pVar;
        this.f15396c = str;
        this.f15395b = i10;
        this.f15398e = pVar2;
    }

    public /* synthetic */ e1(OnboardingState onboardingState, int i10, ho.l lVar, Long l4) {
        this.f15397d = onboardingState;
        this.f15395b = i10;
        this.f15396c = lVar;
        this.f15398e = l4;
    }
}
