package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import io.elevenlabs.domain.model.VoiceSection;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorProfileSortRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.elements.VoicesGridUIKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt;
import io.elevenlabs.ui.components.CalloutKt;
import io.elevenlabs.ui.components.CalloutType;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.MenuKt;
import io.elevenlabs.ui.components.RowWithInvertedMeasurementKt;
import io.elevenlabs.ui.components.SectionHeaderKt;
import io.elevenlabs.ui.components.SectionHeaderStyle;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import io.elevenlabs.ui.echo.components.EchoBackButtonKt;
import io.elevenlabs.ui.echo.components.EchoToastKt;
import j1.l0;
import java.util.List;
import java.util.Map;
import q2.b8;
import q2.c3;
import q2.f0;
import q2.n5;
import r1.b3;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.p {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17116c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17119f;

    public /* synthetic */ f(String str, SectionHeaderStyle sectionHeaderStyle, i3.t tVar, ho.a aVar, int i10, int i11) {
        this.f17114a = 8;
        this.f17119f = str;
        this.f17115b = sectionHeaderStyle;
        this.Y = tVar;
        this.f17116c = aVar;
        this.f17117d = i10;
        this.f17118e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z VoiceDetailsScreen$lambda$2;
        z VoiceDetailsScreenUI$lambda$3;
        z VoiceDesignScreen$lambda$4;
        z VoicePromptStep$lambda$1;
        z Callout$lambda$6;
        z Callout$lambda$1;
        z DropdownMenuContent$lambda$8;
        z RowWithInvertedMeasurement$lambda$1;
        z SectionHeader$lambda$3;
        z EchoThemeHeaderActions$lambda$1;
        z CenteredContentScaffold$lambda$2;
        z AuthorProfileSortButton$lambda$1;
        z VoicesGridUI$lambda$3;
        z EchoBackButton$lambda$0;
        z EchoToastActionButton$lambda$1;
        switch (this.f17114a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                VoiceDetailsScreen$lambda$2 = VoiceDetailsScreenKt.VoiceDetailsScreen$lambda$2((String) this.f17119f, (ho.a) this.f17116c, (ho.l) this.f17115b, (VoiceDetailsViewModel) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue);
                return VoiceDetailsScreen$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                VoiceDetailsScreenUI$lambda$3 = VoiceDetailsScreenKt.VoiceDetailsScreenUI$lambda$3((ho.l) this.f17115b, (VoiceDetailsState) this.f17119f, (ho.a) this.f17116c, (ho.l) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue2);
                return VoiceDetailsScreenUI$lambda$3;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                VoiceDesignScreen$lambda$4 = VoiceDesignScreenKt.VoiceDesignScreen$lambda$4((ho.a) this.f17116c, (ho.l) this.f17115b, (ho.a) this.f17119f, (VoiceDesignViewModel) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue3);
                return VoiceDesignScreen$lambda$4;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                VoicePromptStep$lambda$1 = VoicePromptStepKt.VoicePromptStep$lambda$1((VoiceDesignContract.State) this.f17119f, (List) this.f17116c, (ho.l) this.f17115b, (i3.t) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue4);
                return VoicePromptStep$lambda$1;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                Callout$lambda$6 = CalloutKt.Callout$lambda$6((CalloutType) this.f17119f, (ho.p) this.f17115b, (ho.a) this.f17116c, (i3.t) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue5);
                return Callout$lambda$6;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                Callout$lambda$1 = CalloutKt.Callout$lambda$1((CalloutType) this.f17115b, (String) this.f17119f, (ho.a) this.f17116c, (i3.t) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue6);
                return Callout$lambda$1;
            case 6:
                int intValue7 = ((Integer) obj2).intValue();
                DropdownMenuContent$lambda$8 = MenuKt.DropdownMenuContent$lambda$8((l0) this.f17119f, (z0) this.f17116c, (i3.t) this.f17115b, (ho.q) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue7);
                return DropdownMenuContent$lambda$8;
            case 7:
                int intValue8 = ((Integer) obj2).intValue();
                RowWithInvertedMeasurement$lambda$1 = RowWithInvertedMeasurementKt.RowWithInvertedMeasurement$lambda$1((i3.t) this.f17119f, (r1.g) this.f17116c, (i3.f) this.f17115b, (ho.q) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue8);
                return RowWithInvertedMeasurement$lambda$1;
            case 8:
                int intValue9 = ((Integer) obj2).intValue();
                SectionHeader$lambda$3 = SectionHeaderKt.SectionHeader$lambda$3((String) this.f17119f, (SectionHeaderStyle) this.f17115b, (i3.t) this.Y, (ho.a) this.f17116c, this.f17117d, this.f17118e, (u2.m) obj, intValue9);
                return SectionHeader$lambda$3;
            case 9:
                int intValue10 = ((Integer) obj2).intValue();
                EchoThemeHeaderActions$lambda$1 = HeaderActionsKt.EchoThemeHeaderActions$lambda$1((i3.t) this.f17116c, (String) this.f17119f, (ho.q) this.f17115b, (ho.q) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue10);
                return EchoThemeHeaderActions$lambda$1;
            case 10:
                int intValue11 = ((Integer) obj2).intValue();
                CenteredContentScaffold$lambda$2 = CenteredContentScaffoldKt.CenteredContentScaffold$lambda$2((i3.t) this.f17119f, (ho.p) this.f17116c, (b3) this.f17115b, (ho.p) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue11);
                return CenteredContentScaffold$lambda$2;
            case 11:
                int intValue12 = ((Integer) obj2).intValue();
                AuthorProfileSortButton$lambda$1 = AuthorProfileSortRowKt.AuthorProfileSortButton$lambda$1((String) this.f17119f, (Map) this.f17116c, (ho.l) this.f17115b, (i3.t) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue12);
                return AuthorProfileSortButton$lambda$1;
            case 12:
                int intValue13 = ((Integer) obj2).intValue();
                VoicesGridUI$lambda$3 = VoicesGridUIKt.VoicesGridUI$lambda$3((VoiceSection.VoiceGridSection) this.f17116c, (String) this.f17119f, (ho.l) this.f17115b, (ho.l) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue13);
                return VoicesGridUI$lambda$3;
            case 13:
                ((Integer) obj2).getClass();
                q2.i.d((ho.a) this.f17116c, (i3.t) this.f17119f, (l5.u) this.f17115b, (c3.j) this.Y, (u2.m) obj, u2.r.M(this.f17117d | 1), this.f17118e);
                return z.f31622a;
            case 14:
                ((Integer) obj2).getClass();
                c3.b((f0) this.f17119f, (n5) this.f17116c, (b8) this.f17115b, (ho.p) this.Y, (u2.m) obj, u2.r.M(this.f17117d | 1), this.f17118e);
                return z.f31622a;
            case 15:
                int intValue14 = ((Integer) obj2).intValue();
                EchoBackButton$lambda$0 = EchoBackButtonKt.EchoBackButton$lambda$0((ho.a) this.f17116c, (i3.t) this.f17119f, (EchoButtonVariant) this.f17115b, (EchoButtonSize) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue14);
                return EchoBackButton$lambda$0;
            default:
                int intValue15 = ((Integer) obj2).intValue();
                EchoToastActionButton$lambda$1 = EchoToastKt.EchoToastActionButton$lambda$1((String) this.f17119f, (Integer) this.f17115b, (ho.a) this.f17116c, (i3.t) this.Y, this.f17117d, this.f17118e, (u2.m) obj, intValue15);
                return EchoToastActionButton$lambda$1;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, ho.a aVar, i3.t tVar, int i10, int i11, int i12) {
        this.f17114a = i12;
        this.f17119f = obj;
        this.f17115b = obj2;
        this.f17116c = aVar;
        this.Y = tVar;
        this.f17117d = i10;
        this.f17118e = i11;
    }

    public /* synthetic */ f(Object obj, Object obj2, ho.a aVar, Object obj3, int i10, int i11, int i12) {
        this.f17114a = i12;
        this.f17115b = obj;
        this.f17119f = obj2;
        this.f17116c = aVar;
        this.Y = obj3;
        this.f17117d = i10;
        this.f17118e = i11;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11, int i12) {
        this.f17114a = i12;
        this.f17119f = obj;
        this.f17116c = obj2;
        this.f17115b = obj3;
        this.Y = obj4;
        this.f17117d = i10;
        this.f17118e = i11;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11, int i12, boolean z6) {
        this.f17114a = i12;
        this.f17116c = obj;
        this.f17119f = obj2;
        this.f17115b = obj3;
        this.Y = obj4;
        this.f17117d = i10;
        this.f17118e = i11;
    }

    public /* synthetic */ f(ho.a aVar, ho.l lVar, ho.a aVar2, VoiceDesignViewModel voiceDesignViewModel, int i10, int i11) {
        this.f17114a = 2;
        this.f17116c = aVar;
        this.f17115b = lVar;
        this.f17119f = aVar2;
        this.Y = voiceDesignViewModel;
        this.f17117d = i10;
        this.f17118e = i11;
    }
}
