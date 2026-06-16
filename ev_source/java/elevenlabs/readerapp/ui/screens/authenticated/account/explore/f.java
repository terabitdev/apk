package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import ho.l;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoiceDesignTipsSheetKt;
import java.util.List;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14995a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f14997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f14998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14999e;

    public /* synthetic */ f(String str, List list, l lVar, int i10) {
        this.f14996b = str;
        this.f14997c = list;
        this.f14998d = lVar;
        this.f14999e = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z SelectLanguageUI$lambda$1;
        z TraitSection$lambda$1;
        switch (this.f14995a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                String str = this.f14996b;
                SelectLanguageUI$lambda$1 = ExploreLanguageSettingScreenKt.SelectLanguageUI$lambda$1(this.f14997c, str, this.f14998d, this.f14999e, (m) obj, intValue);
                return SelectLanguageUI$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                TraitSection$lambda$1 = VoiceDesignTipsSheetKt.TraitSection$lambda$1(this.f14996b, this.f14997c, this.f14998d, this.f14999e, (m) obj, intValue2);
                return TraitSection$lambda$1;
        }
    }

    public /* synthetic */ f(List list, String str, l lVar, int i10) {
        this.f14997c = list;
        this.f14996b = str;
        this.f14998d = lVar;
        this.f14999e = i10;
    }
}
