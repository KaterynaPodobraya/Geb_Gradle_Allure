package pages
import geb.Page


class GoogleResultsPage extends Page
{
    static at = { $("input#lst-ib") }
    static content = {
        logo {$("[src=\"\\/images\\/branding\\/googlelogo\\/2x\\/googlelogo_color_120x44dp\\.png\"]")}
    }
}