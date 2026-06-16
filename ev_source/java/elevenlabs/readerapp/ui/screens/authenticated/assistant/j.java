package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import android.content.Context;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15127b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f15126a = i10;
        this.f15127b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z AskAssistantSheet$lambda$8$0;
        sn.z AskAssistantSheetUI$lambda$2$0$3$0;
        switch (this.f15126a) {
            case 0:
                AskAssistantSheet$lambda$8$0 = AskAssistantSheetKt.AskAssistantSheet$lambda$8$0((Context) this.f15127b);
                return AskAssistantSheet$lambda$8$0;
            default:
                AskAssistantSheetUI$lambda$2$0$3$0 = AskAssistantSheetKt.AskAssistantSheetUI$lambda$2$0$3$0((j.j) this.f15127b);
                return AskAssistantSheetUI$lambda$2$0$3$0;
        }
    }
}
