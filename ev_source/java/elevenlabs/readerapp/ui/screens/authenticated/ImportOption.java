package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/ImportOption;", "", "", ParameterNames.ICON, "", "title", "Lkotlin/Function0;", "Lsn/z;", "onClick", "<init>", "(ILjava/lang/String;Lho/a;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lho/a;", "copy", "(ILjava/lang/String;Lho/a;)Lio/elevenlabs/readerapp/ui/screens/authenticated/ImportOption;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", TokenNames.I, "getIcon", "Ljava/lang/String;", "getTitle", "Lho/a;", "getOnClick", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ImportOption {
    private final int icon;
    private final ho.a onClick;
    private final String title;

    public ImportOption(int i10, String str, ho.a aVar) {
        str.getClass();
        aVar.getClass();
        this.icon = i10;
        this.title = str;
        this.onClick = aVar;
    }

    public static /* synthetic */ ImportOption copy$default(ImportOption importOption, int i10, String str, ho.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = importOption.icon;
        }
        if ((i11 & 2) != 0) {
            str = importOption.title;
        }
        if ((i11 & 4) != 0) {
            aVar = importOption.onClick;
        }
        return importOption.copy(i10, str, aVar);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final ho.a getOnClick() {
        return this.onClick;
    }

    public final ImportOption copy(int icon, String title, ho.a onClick) {
        title.getClass();
        onClick.getClass();
        return new ImportOption(icon, title, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImportOption)) {
            return false;
        }
        ImportOption importOption = (ImportOption) other;
        if (this.icon == importOption.icon && kotlin.jvm.internal.m.c(this.title, importOption.title) && kotlin.jvm.internal.m.c(this.onClick, importOption.onClick)) {
            return true;
        }
        return false;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final ho.a getOnClick() {
        return this.onClick;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.onClick.hashCode() + j0.c.c(Integer.hashCode(this.icon) * 31, 31, this.title);
    }

    public String toString() {
        return "ImportOption(icon=" + this.icon + ", title=" + this.title + ", onClick=" + this.onClick + Separators.RPAREN;
    }
}
