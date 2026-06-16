package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15112a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AssistantContract.State f15114c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f15116e;

    public /* synthetic */ f(ho.l lVar, AssistantContract.State state, boolean z6, String str) {
        this.f15113b = lVar;
        this.f15114c = state;
        this.f15115d = z6;
        this.f15116e = str;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z AssistantConnectedContent$lambda$1;
        sn.z AskAssistantSheetUI$lambda$2$0$5;
        switch (this.f15112a) {
            case 0:
                int intValue = ((Integer) obj4).intValue();
                ho.l lVar = this.f15113b;
                AssistantConnectedContent$lambda$1 = AskAssistantSheetKt.AssistantConnectedContent$lambda$1(this.f15114c, lVar, this.f15115d, this.f15116e, (i1.o) obj, ((Boolean) obj2).booleanValue(), (u2.m) obj3, intValue);
                return AssistantConnectedContent$lambda$1;
            default:
                int intValue2 = ((Integer) obj4).intValue();
                AskAssistantSheetUI$lambda$2$0$5 = AskAssistantSheetKt.AskAssistantSheetUI$lambda$2$0$5(this.f15113b, this.f15114c, this.f15115d, this.f15116e, (i1.o) obj, ((Boolean) obj2).booleanValue(), (u2.m) obj3, intValue2);
                return AskAssistantSheetUI$lambda$2$0$5;
        }
    }

    public /* synthetic */ f(AssistantContract.State state, ho.l lVar, boolean z6, String str) {
        this.f15114c = state;
        this.f15113b = lVar;
        this.f15115d = z6;
        this.f15116e = str;
    }
}
