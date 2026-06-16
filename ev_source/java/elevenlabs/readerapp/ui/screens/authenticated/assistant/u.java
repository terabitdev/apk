package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SearchResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.HomeReadsCarouselKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt;
import io.elevenlabs.ui.components.SelectableCardKt;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15164c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15166e;

    public /* synthetic */ u(ReadMeta readMeta, boolean z6, ho.l lVar, z0 z0Var) {
        this.f15162a = 1;
        this.f15164c = readMeta;
        this.f15165d = z0Var;
        this.f15166e = lVar;
        this.f15163b = z6;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z AssistantMenu$lambda$0;
        sn.z HomeReadsCarouselV3$lambda$6$1$6;
        sn.z SearchListColumn$lambda$2$0$8;
        sn.z SelectableCard$lambda$1;
        switch (this.f15162a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                AssistantMenu$lambda$0 = AssistantMenuKt.AssistantMenu$lambda$0(this.f15163b, (ho.a) this.f15164c, (ho.a) this.f15165d, (ho.a) this.f15166e, (r1.y) obj, (u2.m) obj2, intValue);
                return AssistantMenu$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                HomeReadsCarouselV3$lambda$6$1$6 = HomeReadsCarouselKt.HomeReadsCarouselV3$lambda$6$1$6((ReadMeta) this.f15164c, (z0) this.f15165d, (ho.l) this.f15166e, this.f15163b, (r1.s) obj, (u2.m) obj2, intValue2);
                return HomeReadsCarouselV3$lambda$6$1$6;
            case 2:
                int intValue3 = ((Integer) obj3).intValue();
                SearchListColumn$lambda$2$0$8 = SearchScreenKt.SearchListColumn$lambda$2$0$8((SearchResult.GlobalRead) this.f15164c, this.f15163b, (ho.l) this.f15165d, (z0) this.f15166e, (r1.s) obj, (u2.m) obj2, intValue3);
                return SearchListColumn$lambda$2$0$8;
            default:
                int intValue4 = ((Integer) obj3).intValue();
                SelectableCard$lambda$1 = SelectableCardKt.SelectableCard$lambda$1(this.f15163b, (ho.q) this.f15164c, (String) this.f15165d, (String) this.f15166e, (r1.s) obj, (u2.m) obj2, intValue4);
                return SelectableCard$lambda$1;
        }
    }

    public /* synthetic */ u(SearchResult.GlobalRead globalRead, boolean z6, ho.l lVar, z0 z0Var) {
        this.f15162a = 2;
        this.f15164c = globalRead;
        this.f15163b = z6;
        this.f15165d = lVar;
        this.f15166e = z0Var;
    }

    public /* synthetic */ u(boolean z6, sn.d dVar, Object obj, Object obj2, int i10) {
        this.f15162a = i10;
        this.f15163b = z6;
        this.f15164c = dVar;
        this.f15165d = obj;
        this.f15166e = obj2;
    }
}
