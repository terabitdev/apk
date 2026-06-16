package io.elevenlabs.readerapp.ui.components;

import i1.j2;
import io.elevenlabs.domain.model.ExploreDeeplinkPosition;
import io.elevenlabs.domain.model.SizeableHeaderImage;
import io.elevenlabs.readerapp.ui.components.explore.ExploreHighlightCarouselKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileState;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreSmallGridCollectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsState;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements ho.p {
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14825f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f14826x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f14827y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f14828z0;

    public /* synthetic */ x(AuthorProfileState authorProfileState, ua.b bVar, ho.a aVar, ho.l lVar, ho.p pVar, ho.l lVar2, ho.l lVar3, ho.p pVar2, int i10, int i11) {
        this.f14820a = 2;
        this.f14821b = authorProfileState;
        this.f14822c = bVar;
        this.f14824e = aVar;
        this.f14825f = lVar;
        this.f14827y0 = pVar;
        this.f14826x0 = lVar2;
        this.f14823d = lVar3;
        this.f14828z0 = pVar2;
        this.Y = i10;
        this.Z = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z MediaHeaderSection$lambda$1;
        sn.z ExploreHighlightCarousel$lambda$2;
        sn.z AuthorProfileScreenUi$lambda$6;
        sn.z ExploreScreen$lambda$8;
        sn.z ExploreSmallGridCollection$lambda$3;
        sn.z DefaultHeader$lambda$1;
        sn.z ReadDetailsScreenUi$lambda$30;
        switch (this.f14820a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                MediaHeaderSection$lambda$1 = MediaHeaderSectionKt.MediaHeaderSection$lambda$1((String) this.f14821b, (i3.t) this.f14825f, (SizeableHeaderImage) this.f14826x0, (List) this.f14823d, (String) this.f14822c, (ho.p) this.f14827y0, (ho.a) this.f14824e, (ho.p) this.f14828z0, this.Y, this.Z, (u2.m) obj, intValue);
                return MediaHeaderSection$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ExploreHighlightCarousel$lambda$2 = ExploreHighlightCarouselKt.ExploreHighlightCarousel$lambda$2((String) this.f14821b, (String) this.f14822c, (List) this.f14823d, (ho.l) this.f14826x0, (ho.a) this.f14824e, (i3.t) this.f14825f, (ho.l) this.f14827y0, (String) this.f14828z0, this.Y, this.Z, (u2.m) obj, intValue2);
                return ExploreHighlightCarousel$lambda$2;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                AuthorProfileScreenUi$lambda$6 = AuthorProfileScreenKt.AuthorProfileScreenUi$lambda$6((AuthorProfileState) this.f14821b, (ua.b) this.f14822c, (ho.a) this.f14824e, (ho.l) this.f14825f, (ho.p) this.f14827y0, (ho.l) this.f14826x0, (ho.l) this.f14823d, (ho.p) this.f14828z0, this.Y, this.Z, (u2.m) obj, intValue3);
                return AuthorProfileScreenUi$lambda$6;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                ExploreScreen$lambda$8 = ExploreScreenKt.ExploreScreen$lambda$8((ExploreViewModel) this.f14821b, (ho.l) this.f14822c, (ho.p) this.f14827y0, (ho.a) this.f14824e, (ho.l) this.f14825f, (ho.p) this.f14828z0, (j2) this.f14826x0, (i1.o) this.f14823d, this.Y, this.Z, (u2.m) obj, intValue4);
                return ExploreScreen$lambda$8;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                ExploreSmallGridCollection$lambda$3 = ExploreSmallGridCollectionKt.ExploreSmallGridCollection$lambda$3((String) this.f14821b, (String) this.f14822c, (List) this.f14823d, (ho.l) this.f14826x0, (ho.a) this.f14824e, (i3.t) this.f14825f, (Integer) this.f14827y0, (ExploreDeeplinkPosition) this.f14828z0, this.Y, this.Z, (u2.m) obj, intValue5);
                return ExploreSmallGridCollection$lambda$3;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                DefaultHeader$lambda$1 = VoicePickerHeaderKt.DefaultHeader$lambda$1((VoicePickerMode) this.f14821b, (VoicePickerContract.State) this.f14822c, (ho.l) this.f14825f, (VoicePickerSharedContract.State) this.f14826x0, (ho.l) this.f14823d, (j2) this.f14827y0, (i1.o) this.f14828z0, (i1.o) this.f14824e, this.Y, this.Z, (u2.m) obj, intValue6);
                return DefaultHeader$lambda$1;
            default:
                int intValue7 = ((Integer) obj2).intValue();
                ReadDetailsScreenUi$lambda$30 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$30((ReadDetailsState) this.f14821b, (ho.p) this.f14827y0, (ho.l) this.f14822c, (ho.a) this.f14824e, (ho.l) this.f14825f, (ho.l) this.f14826x0, (ho.l) this.f14823d, (ho.l) this.f14828z0, this.Y, this.Z, (u2.m) obj, intValue7);
                return ReadDetailsScreenUi$lambda$30;
        }
    }

    public /* synthetic */ x(ExploreViewModel exploreViewModel, ho.l lVar, ho.p pVar, ho.a aVar, ho.l lVar2, ho.p pVar2, j2 j2Var, i1.o oVar, int i10, int i11) {
        this.f14820a = 3;
        this.f14821b = exploreViewModel;
        this.f14822c = lVar;
        this.f14827y0 = pVar;
        this.f14824e = aVar;
        this.f14825f = lVar2;
        this.f14828z0 = pVar2;
        this.f14826x0 = j2Var;
        this.f14823d = oVar;
        this.Y = i10;
        this.Z = i11;
    }

    public /* synthetic */ x(VoicePickerMode voicePickerMode, VoicePickerContract.State state, ho.l lVar, VoicePickerSharedContract.State state2, ho.l lVar2, j2 j2Var, i1.o oVar, i1.o oVar2, int i10, int i11) {
        this.f14820a = 5;
        this.f14821b = voicePickerMode;
        this.f14822c = state;
        this.f14825f = lVar;
        this.f14826x0 = state2;
        this.f14823d = lVar2;
        this.f14827y0 = j2Var;
        this.f14828z0 = oVar;
        this.f14824e = oVar2;
        this.Y = i10;
        this.Z = i11;
    }

    public /* synthetic */ x(ReadDetailsState readDetailsState, ho.p pVar, ho.l lVar, ho.a aVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.l lVar5, int i10, int i11) {
        this.f14820a = 6;
        this.f14821b = readDetailsState;
        this.f14827y0 = pVar;
        this.f14822c = lVar;
        this.f14824e = aVar;
        this.f14825f = lVar2;
        this.f14826x0 = lVar3;
        this.f14823d = lVar4;
        this.f14828z0 = lVar5;
        this.Y = i10;
        this.Z = i11;
    }

    public /* synthetic */ x(String str, i3.t tVar, SizeableHeaderImage sizeableHeaderImage, List list, String str2, ho.p pVar, ho.a aVar, ho.p pVar2, int i10, int i11) {
        this.f14820a = 0;
        this.f14821b = str;
        this.f14825f = tVar;
        this.f14826x0 = sizeableHeaderImage;
        this.f14823d = list;
        this.f14822c = str2;
        this.f14827y0 = pVar;
        this.f14824e = aVar;
        this.f14828z0 = pVar2;
        this.Y = i10;
        this.Z = i11;
    }

    public /* synthetic */ x(String str, String str2, List list, ho.l lVar, ho.a aVar, i3.t tVar, Object obj, Object obj2, int i10, int i11, int i12) {
        this.f14820a = i12;
        this.f14821b = str;
        this.f14822c = str2;
        this.f14823d = list;
        this.f14826x0 = lVar;
        this.f14824e = aVar;
        this.f14825f = tVar;
        this.f14827y0 = obj;
        this.f14828z0 = obj2;
        this.Y = i10;
        this.Z = i11;
    }
}
