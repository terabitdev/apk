package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantSheetKt;
import io.elevenlabs.ui.components.EchoToggleKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15020c;

    public /* synthetic */ n(ho.l lVar, int i10, boolean z6) {
        this.f15018a = i10;
        this.f15019b = lVar;
        this.f15020c = z6;
    }

    @Override // ho.a
    public final Object invoke() {
        z AssistantRow$lambda$0$0$0;
        z EchoToggle$lambda$2$0;
        switch (this.f15018a) {
            case 0:
                AssistantRow$lambda$0$0$0 = ContentPreferencesScreenKt.AssistantRow$lambda$0$0$0(this.f15019b, this.f15020c);
                return AssistantRow$lambda$0$0$0;
            case 1:
                return AskAssistantSheetKt.r(this.f15019b, this.f15020c);
            case 2:
                return AskAssistantSheetKt.C(this.f15019b, this.f15020c);
            case 3:
                EchoToggle$lambda$2$0 = EchoToggleKt.EchoToggle$lambda$2$0(this.f15019b, this.f15020c);
                return EchoToggle$lambda$2$0;
            default:
                this.f15019b.invoke(Boolean.valueOf(!this.f15020c));
                return z.f31622a;
        }
    }
}
