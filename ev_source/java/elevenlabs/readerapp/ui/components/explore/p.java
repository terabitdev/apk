package io.elevenlabs.readerapp.ui.components.explore;

import i3.t;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsState;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorProfileSortRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveySheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveyState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareOptionsSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareOptionsViewModel;
import io.elevenlabs.ui.components.ActionRowItemKt;
import io.elevenlabs.ui.components.ButtonOutlinedKt;
import io.elevenlabs.ui.components.headers.EchoHeaderStyle;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import java.util.Map;
import p3.b1;
import sn.z;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14633c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14636f;

    public /* synthetic */ p(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, t tVar, int i10, int i11) {
        this.f14631a = 11;
        this.f14632b = aVar;
        this.f14636f = aVar2;
        this.f14633c = aVar3;
        this.Z = aVar4;
        this.Y = tVar;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ExploreReadCard$lambda$1;
        z DownloadsScreen$lambda$3;
        z ExploreCollectionScreen$lambda$12;
        z ContentPreferencesScreen$lambda$1;
        z ManageContentInterestsUI$lambda$5;
        z AuthorProfileScreen$lambda$9;
        z CreateCollectionSheetUI$lambda$4;
        z BookPurchasesScreenUI$lambda$6;
        z PurchaseHoursScreenUI$lambda$6;
        z AddSharedReadScreen$lambda$3;
        z ImportContentBrowserSurveySheetUI$lambda$5;
        z ShareActions$lambda$1;
        z ReadShareOptionsSheet$lambda$2;
        z ActionRowItem$lambda$2;
        z ButtonOutlined$lambda$1;
        z HeaderActions$lambda$3;
        z HeaderActions$lambda$1;
        z EchoHeader$lambda$1;
        z AuthorProfileSortRow$lambda$1;
        switch (this.f14631a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ExploreReadCard$lambda$1 = ExploreReadCardKt.ExploreReadCard$lambda$1((ExploreRead) this.f14636f, (ho.a) this.f14632b, (t) this.Y, (ho.l) this.f14633c, (String) this.Z, this.f14634d, this.f14635e, (u2.m) obj, intValue);
                return ExploreReadCard$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                DownloadsScreen$lambda$3 = DownloadsScreenKt.DownloadsScreen$lambda$3((ho.a) this.f14632b, (ho.l) this.f14633c, (ho.p) this.f14636f, (ho.a) this.Y, (DownloadsViewModel) this.Z, this.f14634d, this.f14635e, (u2.m) obj, intValue2);
                return DownloadsScreen$lambda$3;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                ExploreCollectionScreen$lambda$12 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$12((String) this.Z, (ho.a) this.f14632b, (ho.l) this.f14633c, (ho.p) this.f14636f, (ExploreCollectionViewModel) this.Y, this.f14634d, this.f14635e, (u2.m) obj, intValue3);
                return ExploreCollectionScreen$lambda$12;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                ContentPreferencesScreen$lambda$1 = ContentPreferencesScreenKt.ContentPreferencesScreen$lambda$1((ho.a) this.f14632b, (ho.a) this.f14636f, (ho.a) this.Y, (ho.a) this.f14633c, (ContentPreferencesViewModel) this.Z, this.f14634d, this.f14635e, (u2.m) obj, intValue4);
                return ContentPreferencesScreen$lambda$1;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                ManageContentInterestsUI$lambda$5 = ManageContentInterestsScreenKt.ManageContentInterestsUI$lambda$5((ManageContentInterestsState) this.f14636f, (ho.a) this.f14632b, (ho.a) this.Y, (ho.p) this.f14633c, (ho.a) this.Z, this.f14634d, this.f14635e, (u2.m) obj, intValue5);
                return ManageContentInterestsUI$lambda$5;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                AuthorProfileScreen$lambda$9 = AuthorProfileScreenKt.AuthorProfileScreen$lambda$9((String) this.Z, (ho.a) this.f14632b, (ho.l) this.f14633c, (ho.p) this.f14636f, (AuthorProfileViewModel) this.Y, this.f14634d, this.f14635e, (u2.m) obj, intValue6);
                return AuthorProfileScreen$lambda$9;
            case 6:
                int intValue7 = ((Integer) obj2).intValue();
                CreateCollectionSheetUI$lambda$4 = CreateCollectionSheetKt.CreateCollectionSheetUI$lambda$4((CreateCollectionState) this.f14636f, (ReadMeta) this.Y, (ho.l) this.f14633c, (ho.l) this.Z, (ho.a) this.f14632b, this.f14634d, this.f14635e, (u2.m) obj, intValue7);
                return CreateCollectionSheetUI$lambda$4;
            case 7:
                int intValue8 = ((Integer) obj2).intValue();
                BookPurchasesScreenUI$lambda$6 = BookPurchasesScreenKt.BookPurchasesScreenUI$lambda$6((BookPurchasesState) this.f14636f, (ho.a) this.f14632b, (ho.a) this.Y, (ho.l) this.f14633c, (ho.l) this.Z, this.f14634d, this.f14635e, (u2.m) obj, intValue8);
                return BookPurchasesScreenUI$lambda$6;
            case 8:
                int intValue9 = ((Integer) obj2).intValue();
                PurchaseHoursScreenUI$lambda$6 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$6((PurchaseHoursState) this.f14636f, (ho.l) this.f14633c, (ho.a) this.f14632b, (ho.l) this.Y, (ho.a) this.Z, this.f14634d, this.f14635e, (u2.m) obj, intValue9);
                return PurchaseHoursScreenUI$lambda$6;
            case 9:
                int intValue10 = ((Integer) obj2).intValue();
                AddSharedReadScreen$lambda$3 = AddSharedReadScreenKt.AddSharedReadScreen$lambda$3((String) this.Z, (String) this.f14636f, (ho.l) this.f14633c, (ho.a) this.f14632b, (AddSharedReadViewModel) this.Y, this.f14634d, this.f14635e, (u2.m) obj, intValue10);
                return AddSharedReadScreen$lambda$3;
            case 10:
                int intValue11 = ((Integer) obj2).intValue();
                ImportContentBrowserSurveySheetUI$lambda$5 = ImportContentBrowserSurveySheetKt.ImportContentBrowserSurveySheetUI$lambda$5((ImportContentBrowserSurveyState) this.f14636f, (ho.a) this.f14632b, (ho.a) this.Y, (ho.l) this.f14633c, (ho.l) this.Z, this.f14634d, this.f14635e, (u2.m) obj, intValue11);
                return ImportContentBrowserSurveySheetUI$lambda$5;
            case 11:
                int intValue12 = ((Integer) obj2).intValue();
                ShareActions$lambda$1 = ReadShareDetailsScreenKt.ShareActions$lambda$1((ho.a) this.f14632b, (ho.a) this.f14636f, (ho.a) this.f14633c, (ho.a) this.Z, (t) this.Y, this.f14634d, this.f14635e, (u2.m) obj, intValue12);
                return ShareActions$lambda$1;
            case 12:
                int intValue13 = ((Integer) obj2).intValue();
                ReadShareOptionsSheet$lambda$2 = ReadShareOptionsSheetKt.ReadShareOptionsSheet$lambda$2((String) this.Z, (ho.a) this.f14632b, (ho.a) this.f14636f, (ho.a) this.Y, (ReadShareOptionsViewModel) this.f14633c, this.f14634d, this.f14635e, (u2.m) obj, intValue13);
                return ReadShareOptionsSheet$lambda$2;
            case 13:
                int intValue14 = ((Integer) obj2).intValue();
                ActionRowItem$lambda$2 = ActionRowItemKt.ActionRowItem$lambda$2((String) this.Z, (t) this.Y, (Integer) this.f14636f, (Integer) this.f14633c, (ho.a) this.f14632b, this.f14634d, this.f14635e, (u2.m) obj, intValue14);
                return ActionRowItem$lambda$2;
            case 14:
                int intValue15 = ((Integer) obj2).intValue();
                ButtonOutlined$lambda$1 = ButtonOutlinedKt.ButtonOutlined$lambda$1((String) this.Z, (ho.a) this.f14632b, (t) this.Y, (b1) this.f14636f, (ho.q) this.f14633c, this.f14634d, this.f14635e, (u2.m) obj, intValue15);
                return ButtonOutlined$lambda$1;
            case 15:
                int intValue16 = ((Integer) obj2).intValue();
                HeaderActions$lambda$3 = HeaderActionsKt.HeaderActions$lambda$3((t) this.Y, (ho.q) this.f14636f, (ho.q) this.f14632b, (ho.q) this.f14633c, (i3.f) this.Z, this.f14634d, this.f14635e, (u2.m) obj, intValue16);
                return HeaderActions$lambda$3;
            case 16:
                int intValue17 = ((Integer) obj2).intValue();
                HeaderActions$lambda$1 = HeaderActionsKt.HeaderActions$lambda$1((t) this.Y, (String) this.Z, (ho.q) this.f14636f, (ho.q) this.f14632b, (i3.f) this.f14633c, this.f14634d, this.f14635e, (u2.m) obj, intValue17);
                return HeaderActions$lambda$1;
            case 17:
                int intValue18 = ((Integer) obj2).intValue();
                EchoHeader$lambda$1 = HeaderKt.EchoHeader$lambda$1((String) this.Z, (t) this.Y, (t) this.f14636f, (ho.q) this.f14632b, (EchoHeaderStyle) this.f14633c, this.f14634d, this.f14635e, (u2.m) obj, intValue18);
                return EchoHeader$lambda$1;
            case 18:
                int intValue19 = ((Integer) obj2).intValue();
                AuthorProfileSortRow$lambda$1 = AuthorProfileSortRowKt.AuthorProfileSortRow$lambda$1((String) this.Z, (Map) this.f14636f, (String) this.f14632b, (ho.l) this.f14633c, (t) this.Y, this.f14634d, this.f14635e, (u2.m) obj, intValue19);
                return AuthorProfileSortRow$lambda$1;
            default:
                ((Integer) obj2).getClass();
                kd.a.c((vk.j) this.f14636f, (t) this.Y, (vk.i) this.f14632b, (vk.j) this.f14633c, (c3.j) this.Z, (u2.m) obj, r.M(this.f14634d | 1), this.f14635e);
                return z.f31622a;
        }
    }

    public /* synthetic */ p(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ContentPreferencesViewModel contentPreferencesViewModel, int i10, int i11) {
        this.f14631a = 3;
        this.f14632b = aVar;
        this.f14636f = aVar2;
        this.Y = aVar3;
        this.f14633c = aVar4;
        this.Z = contentPreferencesViewModel;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(ho.a aVar, ho.l lVar, ho.p pVar, ho.a aVar2, DownloadsViewModel downloadsViewModel, int i10, int i11) {
        this.f14631a = 1;
        this.f14632b = aVar;
        this.f14633c = lVar;
        this.f14636f = pVar;
        this.Y = aVar2;
        this.Z = downloadsViewModel;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(t tVar, ho.q qVar, ho.q qVar2, ho.q qVar3, i3.f fVar, int i10, int i11) {
        this.f14631a = 15;
        this.Y = tVar;
        this.f14636f = qVar;
        this.f14632b = qVar2;
        this.f14633c = qVar3;
        this.Z = fVar;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(t tVar, String str, ho.q qVar, ho.q qVar2, i3.f fVar, int i10, int i11) {
        this.f14631a = 16;
        this.Y = tVar;
        this.Z = str;
        this.f14636f = qVar;
        this.f14632b = qVar2;
        this.f14633c = fVar;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(CreateCollectionState createCollectionState, ReadMeta readMeta, ho.l lVar, ho.l lVar2, ho.a aVar, int i10, int i11) {
        this.f14631a = 6;
        this.f14636f = createCollectionState;
        this.Y = readMeta;
        this.f14633c = lVar;
        this.Z = lVar2;
        this.f14632b = aVar;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(PurchaseHoursState purchaseHoursState, ho.l lVar, ho.a aVar, ho.l lVar2, ho.a aVar2, int i10, int i11) {
        this.f14631a = 8;
        this.f14636f = purchaseHoursState;
        this.f14633c = lVar;
        this.f14632b = aVar;
        this.Y = lVar2;
        this.Z = aVar2;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(Object obj, ho.a aVar, Object obj2, sn.d dVar, Object obj3, int i10, int i11, int i12) {
        this.f14631a = i12;
        this.f14636f = obj;
        this.f14632b = aVar;
        this.Y = obj2;
        this.f14633c = dVar;
        this.Z = obj3;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(String str, ho.a aVar, ho.a aVar2, ho.a aVar3, ReadShareOptionsViewModel readShareOptionsViewModel, int i10, int i11) {
        this.f14631a = 12;
        this.Z = str;
        this.f14632b = aVar;
        this.f14636f = aVar2;
        this.Y = aVar3;
        this.f14633c = readShareOptionsViewModel;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(String str, ho.a aVar, ho.l lVar, ho.p pVar, MviViewModel mviViewModel, int i10, int i11, int i12) {
        this.f14631a = i12;
        this.Z = str;
        this.f14632b = aVar;
        this.f14633c = lVar;
        this.f14636f = pVar;
        this.Y = mviViewModel;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(String str, ho.a aVar, t tVar, b1 b1Var, ho.q qVar, int i10, int i11) {
        this.f14631a = 14;
        this.Z = str;
        this.f14632b = aVar;
        this.Y = tVar;
        this.f14636f = b1Var;
        this.f14633c = qVar;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(String str, t tVar, t tVar2, ho.q qVar, EchoHeaderStyle echoHeaderStyle, int i10, int i11) {
        this.f14631a = 17;
        this.Z = str;
        this.Y = tVar;
        this.f14636f = tVar2;
        this.f14632b = qVar;
        this.f14633c = echoHeaderStyle;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(String str, t tVar, Integer num, Integer num2, ho.a aVar, int i10, int i11) {
        this.f14631a = 13;
        this.Z = str;
        this.Y = tVar;
        this.f14636f = num;
        this.f14633c = num2;
        this.f14632b = aVar;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(String str, String str2, ho.l lVar, ho.a aVar, AddSharedReadViewModel addSharedReadViewModel, int i10, int i11) {
        this.f14631a = 9;
        this.Z = str;
        this.f14636f = str2;
        this.f14633c = lVar;
        this.f14632b = aVar;
        this.Y = addSharedReadViewModel;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(String str, Map map, String str2, ho.l lVar, t tVar, int i10, int i11) {
        this.f14631a = 18;
        this.Z = str;
        this.f14636f = map;
        this.f14632b = str2;
        this.f14633c = lVar;
        this.Y = tVar;
        this.f14634d = i10;
        this.f14635e = i11;
    }

    public /* synthetic */ p(vk.j jVar, t tVar, vk.i iVar, vk.j jVar2, c3.j jVar3, int i10, int i11) {
        this.f14631a = 19;
        this.f14636f = jVar;
        this.Y = tVar;
        this.f14632b = iVar;
        this.f14633c = jVar2;
        this.Z = jVar3;
        this.f14634d = i10;
        this.f14635e = i11;
    }
}
