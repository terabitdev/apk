package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.r {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15099a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15101c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f15102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15104f;

    public /* synthetic */ d(AssistantContract.State state, ho.l lVar, j.j jVar, ho.a aVar, boolean z6, String str) {
        this.f15103e = state;
        this.f15100b = lVar;
        this.f15104f = jVar;
        this.f15102d = aVar;
        this.f15101c = z6;
        this.Y = str;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z AskAssistantSheetUI$lambda$2;
        sn.z AuthorProfileContent$lambda$3$0$0$3;
        switch (this.f15099a) {
            case 0:
                int intValue = ((Integer) obj4).intValue();
                AskAssistantSheetUI$lambda$2 = AskAssistantSheetKt.AskAssistantSheetUI$lambda$2((AssistantContract.State) this.f15103e, this.f15100b, (j.j) this.f15104f, this.f15102d, this.f15101c, (String) this.Y, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue);
                return AskAssistantSheetUI$lambda$2;
            default:
                int intValue2 = ((Integer) obj4).intValue();
                AuthorProfileContent$lambda$3$0$0$3 = AuthorProfileScreenKt.AuthorProfileContent$lambda$3$0$0$3((ua.b) this.f15103e, this.f15100b, (AuthorProfile) this.f15104f, this.f15101c, this.f15102d, (ho.l) this.Y, (t1.b) obj, ((Integer) obj2).intValue(), (u2.m) obj3, intValue2);
                return AuthorProfileContent$lambda$3$0$0$3;
        }
    }

    public /* synthetic */ d(ua.b bVar, ho.l lVar, AuthorProfile authorProfile, boolean z6, ho.a aVar, ho.l lVar2) {
        this.f15103e = bVar;
        this.f15100b = lVar;
        this.f15104f = authorProfile;
        this.f15101c = z6;
        this.f15102d = aVar;
        this.Y = lVar2;
    }
}
