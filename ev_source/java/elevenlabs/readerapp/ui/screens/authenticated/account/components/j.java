package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import ho.l;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantVoiceModeScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components.PronunciationPreviewButtonKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components.PronunciationPreviewButtonVariant;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt;
import java.util.List;
import q2.d5;
import q2.x2;
import r1.z1;
import sn.z;
import u2.m;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14969a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f14971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14974f;

    public /* synthetic */ j(ho.a aVar, t tVar, boolean z6, x2 x2Var, c3.j jVar, int i10, int i11) {
        this.Z = aVar;
        this.f14971c = tVar;
        this.f14970b = z6;
        this.f14974f = x2Var;
        this.Y = jVar;
        this.f14972d = i10;
        this.f14973e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ContentInterestGridItem$lambda$1;
        z AgentChatList$lambda$7;
        z AssistantVoiceModeScreen$lambda$2;
        z PreviewButton$lambda$0;
        z PronunciationPreviewButton$lambda$2;
        switch (this.f14969a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ContentInterestGridItem$lambda$1 = ContentInterestGridItemKt.ContentInterestGridItem$lambda$1(this.f14970b, (String) this.f14974f, (String) this.Y, (ho.a) this.Z, this.f14971c, this.f14972d, this.f14973e, (m) obj, intValue);
                return ContentInterestGridItem$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                AgentChatList$lambda$7 = AgentChatListKt.AgentChatList$lambda$7((List) this.f14974f, this.f14970b, this.f14971c, (t1.z) this.Y, (z1) this.Z, this.f14972d, this.f14973e, (m) obj, intValue2);
                return AgentChatList$lambda$7;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                AssistantVoiceModeScreen$lambda$2 = AssistantVoiceModeScreenKt.AssistantVoiceModeScreen$lambda$2((String) this.f14974f, (AssistantContract.State) this.Y, this.f14970b, (l) this.Z, this.f14971c, this.f14972d, this.f14973e, (m) obj, intValue3);
                return AssistantVoiceModeScreen$lambda$2;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                PreviewButton$lambda$0 = ReadDetailsScreenKt.PreviewButton$lambda$0((String) this.f14974f, this.f14970b, (ho.a) this.Z, (ho.a) this.Y, this.f14971c, this.f14972d, this.f14973e, (m) obj, intValue4);
                return PreviewButton$lambda$0;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                PronunciationPreviewButton$lambda$2 = PronunciationPreviewButtonKt.PronunciationPreviewButton$lambda$2((PronunciationPreviewState) this.f14974f, (PronunciationPreviewButtonVariant) this.Y, (ho.a) this.Z, this.f14971c, this.f14970b, this.f14972d, this.f14973e, (m) obj, intValue5);
                return PronunciationPreviewButton$lambda$2;
            default:
                ((Integer) obj2).getClass();
                d5.f((ho.a) this.Z, this.f14971c, this.f14970b, (x2) this.f14974f, (c3.j) this.Y, (m) obj, r.M(this.f14972d | 1), this.f14973e);
                return z.f31622a;
        }
    }

    public /* synthetic */ j(PronunciationPreviewState pronunciationPreviewState, PronunciationPreviewButtonVariant pronunciationPreviewButtonVariant, ho.a aVar, t tVar, boolean z6, int i10, int i11) {
        this.f14974f = pronunciationPreviewState;
        this.Y = pronunciationPreviewButtonVariant;
        this.Z = aVar;
        this.f14971c = tVar;
        this.f14970b = z6;
        this.f14972d = i10;
        this.f14973e = i11;
    }

    public /* synthetic */ j(String str, AssistantContract.State state, boolean z6, l lVar, t tVar, int i10, int i11) {
        this.f14974f = str;
        this.Y = state;
        this.f14970b = z6;
        this.Z = lVar;
        this.f14971c = tVar;
        this.f14972d = i10;
        this.f14973e = i11;
    }

    public /* synthetic */ j(String str, boolean z6, ho.a aVar, ho.a aVar2, t tVar, int i10, int i11) {
        this.f14974f = str;
        this.f14970b = z6;
        this.Z = aVar;
        this.Y = aVar2;
        this.f14971c = tVar;
        this.f14972d = i10;
        this.f14973e = i11;
    }

    public /* synthetic */ j(List list, boolean z6, t tVar, t1.z zVar, z1 z1Var, int i10, int i11) {
        this.f14974f = list;
        this.f14970b = z6;
        this.f14971c = tVar;
        this.Y = zVar;
        this.Z = z1Var;
        this.f14972d = i10;
        this.f14973e = i11;
    }

    public /* synthetic */ j(boolean z6, String str, String str2, ho.a aVar, t tVar, int i10, int i11) {
        this.f14970b = z6;
        this.f14974f = str;
        this.Y = str2;
        this.Z = aVar;
        this.f14971c = tVar;
        this.f14972d = i10;
        this.f14973e = i11;
    }
}
