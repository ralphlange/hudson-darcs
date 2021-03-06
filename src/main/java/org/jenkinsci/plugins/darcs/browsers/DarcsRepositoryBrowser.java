/*
 * LICENSE
 *
 * "THE BEER-WARE LICENSE" (Revision 42):
 * "Sven Strittmatter" <ich@weltraumschaf.de> wrote this file.
 * As long as you retain this notice you can do whatever you want with
 * this stuff. If we meet some day, and you think this stuff is worth it,
 * you can buy me a beer in return.
 */

package org.jenkinsci.plugins.darcs.browsers;

import org.jenkinsci.plugins.darcs.DarcsChangeSet;
import java.io.IOException;
import java.net.URL;
import hudson.scm.RepositoryBrowser;

/**
 *
 * @author Sven Strittmatter <ich@weltraumschaf.de>
 */
public abstract class DarcsRepositoryBrowser extends RepositoryBrowser<DarcsChangeSet> {
    /**
     * Determines the link to a single file under Perforce.
     * This page should display all the past revisions of this file, etc.
     *
     * @return
     *      null if the browser doesn't have any suitable URL.
     */
    public abstract URL getFileDiffLink(DarcsChangeSet changeSet, String file) throws IOException;

    private static final long serialVersionUID = 1L;
}
