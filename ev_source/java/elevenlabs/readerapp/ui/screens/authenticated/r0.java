package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantTextModeScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.PlayerContentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerAdditionalActionsPagerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerButtonsSleepTimerState;
import ir.z1;
import q2.b2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements ho.p {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16740c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16743f;

    public /* synthetic */ r0(ho.a aVar, v3.f fVar, String str, i3.t tVar, boolean z6, int i10, int i11) {
        this.f16738a = 6;
        this.f16743f = aVar;
        this.f16741d = fVar;
        this.f16742e = str;
        this.Y = tVar;
        this.f16739b = z6;
        this.f16740c = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z NotificationPrimerOverlay$lambda$0;
        sn.z AssistantConnectedContent$lambda$2;
        sn.z AssistantTextModeScreen$lambda$0;
        sn.z SavedItem$lambda$4;
        sn.z PlayerContentsScreen$lambda$2;
        sn.z PageOne$lambda$0;
        switch (this.f16738a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                NotificationPrimerOverlay$lambda$0 = NotificationPrimerBottomSheetKt.NotificationPrimerOverlay$lambda$0(this.f16739b, (NotificationPrimerSource) this.f16741d, (NotificationPrimerModel) this.f16742e, (ho.a) this.f16743f, (ho.p) this.Y, this.f16740c, (u2.m) obj, intValue);
                return NotificationPrimerOverlay$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                AssistantConnectedContent$lambda$2 = AskAssistantSheetKt.AssistantConnectedContent$lambda$2((AssistantStatus) this.f16741d, (AssistantContract.State) this.f16742e, (ho.l) this.f16743f, this.f16739b, (String) this.Y, this.f16740c, (u2.m) obj, intValue2);
                return AssistantConnectedContent$lambda$2;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                AssistantTextModeScreen$lambda$0 = AssistantTextModeScreenKt.AssistantTextModeScreen$lambda$0((AssistantContract.State) this.f16741d, this.f16739b, (ho.l) this.f16742e, (ho.a) this.f16743f, (ho.a) this.Y, this.f16740c, (u2.m) obj, intValue3);
                return AssistantTextModeScreen$lambda$0;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                SavedItem$lambda$4 = LibraryScreenKt.SavedItem$lambda$4((ReadMeta) this.f16741d, this.f16739b, (ho.l) this.f16742e, (ho.l) this.f16743f, (ho.l) this.Y, this.f16740c, (u2.m) obj, intValue4);
                return SavedItem$lambda$4;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                PlayerContentsScreen$lambda$2 = PlayerContentsScreenKt.PlayerContentsScreen$lambda$2((ReadMeta) this.f16741d, (ho.l) this.f16742e, (z1) this.f16743f, this.f16739b, (String) this.Y, this.f16740c, (u2.m) obj, intValue5);
                return PlayerContentsScreen$lambda$2;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                PageOne$lambda$0 = PlayerAdditionalActionsPagerKt.PageOne$lambda$0(this.f16739b, (PlayerButtonsSleepTimerState) this.f16741d, (ho.a) this.f16743f, (ho.a) this.f16742e, (ho.a) this.Y, this.f16740c, (u2.m) obj, intValue6);
                return PageOne$lambda$0;
            default:
                ((Integer) obj2).getClass();
                int M = u2.r.M(1);
                b2.h((ho.a) this.f16743f, (v3.f) this.f16741d, (String) this.f16742e, (i3.t) this.Y, this.f16739b, (u2.m) obj, M, this.f16740c);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, boolean z6, String str, int i10, int i11) {
        this.f16738a = i11;
        this.f16741d = obj;
        this.f16742e = obj2;
        this.f16743f = obj3;
        this.f16739b = z6;
        this.Y = str;
        this.f16740c = i10;
    }

    public /* synthetic */ r0(Object obj, boolean z6, ho.l lVar, sn.d dVar, sn.d dVar2, int i10, int i11) {
        this.f16738a = i11;
        this.f16741d = obj;
        this.f16739b = z6;
        this.f16742e = lVar;
        this.f16743f = dVar;
        this.Y = dVar2;
        this.f16740c = i10;
    }

    public /* synthetic */ r0(boolean z6, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, ho.a aVar, ho.p pVar, int i10) {
        this.f16738a = 0;
        this.f16739b = z6;
        this.f16741d = notificationPrimerSource;
        this.f16742e = notificationPrimerModel;
        this.f16743f = aVar;
        this.Y = pVar;
        this.f16740c = i10;
    }

    public /* synthetic */ r0(boolean z6, PlayerButtonsSleepTimerState playerButtonsSleepTimerState, ho.a aVar, ho.a aVar2, ho.a aVar3, int i10) {
        this.f16738a = 5;
        this.f16739b = z6;
        this.f16741d = playerButtonsSleepTimerState;
        this.f16743f = aVar;
        this.f16742e = aVar2;
        this.Y = aVar3;
        this.f16740c = i10;
    }
}
