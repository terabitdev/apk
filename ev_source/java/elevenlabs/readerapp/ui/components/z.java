package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.PromptSuggestionsSectionKt;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f14843c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f14844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14846f;

    public /* synthetic */ z(List list, ho.l lVar, i3.t tVar, int i10, int i11, int i12) {
        this.f14841a = i12;
        this.f14842b = list;
        this.f14843c = lVar;
        this.f14844d = tVar;
        this.f14845e = i10;
        this.f14846f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z MiniReadGrid$lambda$1;
        sn.z PromptSuggestionsSection$lambda$0;
        sn.z PromptSuggestionsSection$lambda$2;
        switch (this.f14841a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                MiniReadGrid$lambda$1 = MiniReadGridKt.MiniReadGrid$lambda$1(this.f14842b, this.f14843c, this.f14844d, this.f14845e, this.f14846f, (u2.m) obj, intValue);
                return MiniReadGrid$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                PromptSuggestionsSection$lambda$0 = PromptSuggestionsSectionKt.PromptSuggestionsSection$lambda$0(this.f14842b, this.f14843c, this.f14844d, this.f14845e, this.f14846f, (u2.m) obj, intValue2);
                return PromptSuggestionsSection$lambda$0;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                PromptSuggestionsSection$lambda$2 = PromptSuggestionsSectionKt.PromptSuggestionsSection$lambda$2(this.f14842b, this.f14843c, this.f14844d, this.f14845e, this.f14846f, (u2.m) obj, intValue3);
                return PromptSuggestionsSection$lambda$2;
        }
    }
}
