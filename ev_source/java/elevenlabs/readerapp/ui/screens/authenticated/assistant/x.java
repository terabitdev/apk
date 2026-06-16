package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorActionsSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements ho.p {
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15179a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f15182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15184f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ sn.d f15185x0;

    public /* synthetic */ x(String str, List list, ho.l lVar, i3.t tVar, boolean z6, boolean z10, int i10, int i11) {
        this.f15180b = str;
        this.Z = list;
        this.f15185x0 = lVar;
        this.f15182d = tVar;
        this.f15181c = z6;
        this.f15183e = z10;
        this.f15184f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z AssistantVoiceModeUI$lambda$6;
        sn.z SoundscapeListItem$lambda$1;
        sn.z AuthorActionsSection$lambda$1;
        switch (this.f15179a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AssistantVoiceModeUI$lambda$6 = AssistantVoiceModeScreenKt.AssistantVoiceModeUI$lambda$6(this.f15180b, (List) this.Z, (ho.l) this.f15185x0, this.f15182d, this.f15181c, this.f15183e, this.f15184f, this.Y, (u2.m) obj, intValue);
                return AssistantVoiceModeUI$lambda$6;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                SoundscapeListItem$lambda$1 = SoundscapesScreenKt.SoundscapeListItem$lambda$1(this.f15180b, this.f15181c, (ho.a) this.Z, this.f15182d, this.f15183e, (ho.p) this.f15185x0, this.f15184f, this.Y, (u2.m) obj, intValue2);
                return SoundscapeListItem$lambda$1;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                AuthorActionsSection$lambda$1 = AuthorActionsSectionKt.AuthorActionsSection$lambda$1(this.f15181c, this.f15183e, this.f15180b, (ho.a) this.Z, (ho.l) this.f15185x0, this.f15182d, this.f15184f, this.Y, (u2.m) obj, intValue3);
                return AuthorActionsSection$lambda$1;
        }
    }

    public /* synthetic */ x(String str, boolean z6, ho.a aVar, i3.t tVar, boolean z10, ho.p pVar, int i10, int i11) {
        this.f15180b = str;
        this.f15181c = z6;
        this.Z = aVar;
        this.f15182d = tVar;
        this.f15183e = z10;
        this.f15185x0 = pVar;
        this.f15184f = i10;
        this.Y = i11;
    }

    public /* synthetic */ x(boolean z6, boolean z10, String str, ho.a aVar, ho.l lVar, i3.t tVar, int i10, int i11) {
        this.f15181c = z6;
        this.f15183e = z10;
        this.f15180b = str;
        this.Z = aVar;
        this.f15185x0 = lVar;
        this.f15182d = tVar;
        this.f15184f = i10;
        this.Y = i11;
    }
}
