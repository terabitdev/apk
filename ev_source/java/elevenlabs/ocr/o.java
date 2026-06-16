package io.elevenlabs.ocr;

import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreSectionContentKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteViewModel;
import io.elevenlabs.ui.components.CheckboxKt;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.SelectableCardKt;
import java.util.List;
import p3.b1;
import q2.d5;
import q2.x2;
import sn.z;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sn.d f14291c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14294f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f14295x0;

    public /* synthetic */ o(ho.a aVar, ho.a aVar2, ho.p pVar, String str, String str2, boolean z6, int i10, int i11) {
        this.f14289a = 8;
        this.f14291c = aVar;
        this.f14294f = aVar2;
        this.Y = pVar;
        this.Z = str;
        this.f14295x0 = str2;
        this.f14290b = z6;
        this.f14292d = i10;
        this.f14293e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z OcrImportScreen$lambda$9;
        z BookmarkRow$lambda$7;
        z ExploreSectionContent$lambda$5;
        z RecentReadItemV4$lambda$5;
        z ImportFileScreen$lambda$10;
        z ImportLinkScreen$lambda$6;
        z WriteScreen$lambda$9;
        z Checkbox$lambda$5;
        z ConfirmationDialog$lambda$3;
        z SelectableCard$lambda$2;
        switch (this.f14289a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OcrImportScreen$lambda$9 = OcrImportScreenKt.OcrImportScreen$lambda$9((List) this.f14294f, (ho.l) this.Y, (ho.a) this.f14291c, this.f14290b, (ho.l) this.Z, (OcrImportViewModel) this.f14295x0, this.f14292d, this.f14293e, (u2.m) obj, intValue);
                return OcrImportScreen$lambda$9;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                BookmarkRow$lambda$7 = BookmarkRowKt.BookmarkRow$lambda$7((Bookmark) this.f14294f, this.f14290b, (ho.a) this.f14291c, (ho.a) this.Y, (ho.a) this.Z, (i3.t) this.f14295x0, this.f14292d, this.f14293e, (u2.m) obj, intValue2);
                return BookmarkRow$lambda$7;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                ExploreSectionContent$lambda$5 = ExploreSectionContentKt.ExploreSectionContent$lambda$5((ReadsExplorePage.Section) this.f14294f, (ho.l) this.Y, (ho.l) this.Z, (ho.l) this.f14291c, (String) this.f14295x0, this.f14290b, this.f14292d, this.f14293e, (u2.m) obj, intValue3);
                return ExploreSectionContent$lambda$5;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                RecentReadItemV4$lambda$5 = HomeRecentReadsCarouselKt.RecentReadItemV4$lambda$5((ReadMeta) this.f14294f, (ListeningProgress) this.Y, this.f14290b, (ho.a) this.f14291c, (ho.a) this.Z, (i3.t) this.f14295x0, this.f14292d, this.f14293e, (u2.m) obj, intValue4);
                return RecentReadItemV4$lambda$5;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                ImportFileScreen$lambda$10 = ImportFileScreenKt.ImportFileScreen$lambda$10((String) this.f14294f, (ho.a) this.f14291c, (ho.l) this.Y, this.f14290b, (ho.l) this.Z, (ImportFileViewModel) this.f14295x0, this.f14292d, this.f14293e, (u2.m) obj, intValue5);
                return ImportFileScreen$lambda$10;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                ImportLinkScreen$lambda$6 = ImportLinkScreenKt.ImportLinkScreen$lambda$6((ho.a) this.f14291c, (ho.l) this.Y, (String) this.f14294f, this.f14290b, (ho.l) this.Z, (ImportLinkViewModel) this.f14295x0, this.f14292d, this.f14293e, (u2.m) obj, intValue6);
                return ImportLinkScreen$lambda$6;
            case 6:
                int intValue7 = ((Integer) obj2).intValue();
                WriteScreen$lambda$9 = WriteScreenKt.WriteScreen$lambda$9((ho.a) this.f14291c, (ho.l) this.Y, (String) this.f14294f, this.f14290b, (ho.l) this.Z, (WriteViewModel) this.f14295x0, this.f14292d, this.f14293e, (u2.m) obj, intValue7);
                return WriteScreen$lambda$9;
            case 7:
                int intValue8 = ((Integer) obj2).intValue();
                Checkbox$lambda$5 = CheckboxKt.Checkbox$lambda$5(this.f14290b, (ho.a) this.f14291c, (String) this.f14294f, (i3.t) this.Y, (i3.f) this.Z, (ho.p) this.f14295x0, this.f14292d, this.f14293e, (u2.m) obj, intValue8);
                return Checkbox$lambda$5;
            case 8:
                int intValue9 = ((Integer) obj2).intValue();
                ConfirmationDialog$lambda$3 = ConfirmationDialogKt.ConfirmationDialog$lambda$3((ho.a) this.f14291c, (ho.a) this.f14294f, (ho.p) this.Y, (String) this.Z, (String) this.f14295x0, this.f14290b, this.f14292d, this.f14293e, (u2.m) obj, intValue9);
                return ConfirmationDialog$lambda$3;
            case 9:
                int intValue10 = ((Integer) obj2).intValue();
                SelectableCard$lambda$2 = SelectableCardKt.SelectableCard$lambda$2(this.f14290b, (ho.q) this.f14294f, (String) this.Y, (String) this.Z, (ho.a) this.f14291c, (i3.t) this.f14295x0, this.f14292d, this.f14293e, (u2.m) obj, intValue10);
                return SelectableCard$lambda$2;
            default:
                ((Integer) obj2).getClass();
                d5.g((ho.a) this.f14291c, (i3.t) this.f14294f, this.f14290b, (x2) this.Y, (b1) this.Z, (ho.p) this.f14295x0, (u2.m) obj, r.M(this.f14292d | 1), this.f14293e);
                return z.f31622a;
        }
    }

    public /* synthetic */ o(ho.a aVar, ho.l lVar, String str, boolean z6, ho.l lVar2, MviViewModel mviViewModel, int i10, int i11, int i12) {
        this.f14289a = i12;
        this.f14291c = aVar;
        this.Y = lVar;
        this.f14294f = str;
        this.f14290b = z6;
        this.Z = lVar2;
        this.f14295x0 = mviViewModel;
        this.f14292d = i10;
        this.f14293e = i11;
    }

    public /* synthetic */ o(ho.a aVar, i3.t tVar, boolean z6, x2 x2Var, b1 b1Var, ho.p pVar, int i10, int i11) {
        this.f14289a = 10;
        this.f14291c = aVar;
        this.f14294f = tVar;
        this.f14290b = z6;
        this.Y = x2Var;
        this.Z = b1Var;
        this.f14295x0 = pVar;
        this.f14292d = i10;
        this.f14293e = i11;
    }

    public /* synthetic */ o(Bookmark bookmark, boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, i3.t tVar, int i10, int i11) {
        this.f14289a = 1;
        this.f14294f = bookmark;
        this.f14290b = z6;
        this.f14291c = aVar;
        this.Y = aVar2;
        this.Z = aVar3;
        this.f14295x0 = tVar;
        this.f14292d = i10;
        this.f14293e = i11;
    }

    public /* synthetic */ o(ReadMeta readMeta, ListeningProgress listeningProgress, boolean z6, ho.a aVar, ho.a aVar2, i3.t tVar, int i10, int i11) {
        this.f14289a = 3;
        this.f14294f = readMeta;
        this.Y = listeningProgress;
        this.f14290b = z6;
        this.f14291c = aVar;
        this.Z = aVar2;
        this.f14295x0 = tVar;
        this.f14292d = i10;
        this.f14293e = i11;
    }

    public /* synthetic */ o(ReadsExplorePage.Section section, ho.l lVar, ho.l lVar2, ho.l lVar3, String str, boolean z6, int i10, int i11) {
        this.f14289a = 2;
        this.f14294f = section;
        this.Y = lVar;
        this.Z = lVar2;
        this.f14291c = lVar3;
        this.f14295x0 = str;
        this.f14290b = z6;
        this.f14292d = i10;
        this.f14293e = i11;
    }

    public /* synthetic */ o(String str, ho.a aVar, ho.l lVar, boolean z6, ho.l lVar2, ImportFileViewModel importFileViewModel, int i10, int i11) {
        this.f14289a = 4;
        this.f14294f = str;
        this.f14291c = aVar;
        this.Y = lVar;
        this.f14290b = z6;
        this.Z = lVar2;
        this.f14295x0 = importFileViewModel;
        this.f14292d = i10;
        this.f14293e = i11;
    }

    public /* synthetic */ o(List list, ho.l lVar, ho.a aVar, boolean z6, ho.l lVar2, OcrImportViewModel ocrImportViewModel, int i10, int i11) {
        this.f14289a = 0;
        this.f14294f = list;
        this.Y = lVar;
        this.f14291c = aVar;
        this.f14290b = z6;
        this.Z = lVar2;
        this.f14295x0 = ocrImportViewModel;
        this.f14292d = i10;
        this.f14293e = i11;
    }

    public /* synthetic */ o(boolean z6, ho.a aVar, String str, i3.t tVar, i3.f fVar, ho.p pVar, int i10, int i11) {
        this.f14289a = 7;
        this.f14290b = z6;
        this.f14291c = aVar;
        this.f14294f = str;
        this.Y = tVar;
        this.Z = fVar;
        this.f14295x0 = pVar;
        this.f14292d = i10;
        this.f14293e = i11;
    }

    public /* synthetic */ o(boolean z6, ho.q qVar, String str, String str2, ho.a aVar, i3.t tVar, int i10, int i11) {
        this.f14289a = 9;
        this.f14290b = z6;
        this.f14294f = qVar;
        this.Y = str;
        this.Z = str2;
        this.f14291c = aVar;
        this.f14295x0 = tVar;
        this.f14292d = i10;
        this.f14293e = i11;
    }
}
